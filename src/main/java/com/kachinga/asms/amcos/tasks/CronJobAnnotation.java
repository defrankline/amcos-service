package com.kachinga.asms.amcos.tasks;

import com.kachinga.asms.amcos.domain.User;
import com.kachinga.asms.amcos.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component("cronJobAnnotation")
@RequiredArgsConstructor
public class CronJobAnnotation {

    private final UserService userService;

    @Scheduled(cron = "${cron.job.refresh.users}", zone = "Africa/Nairobi")
    public void syncUsers() {
        this.userService.getUsers().subscribe(users -> {
            if (users.size() > 0) {
                for (User user : users) {
                    Optional<User> optional = userService.findById(user.getUserId());
                    User row = optional.orElseGet(User::new);
                    row.setNumber(user.getNumber());
                    row.setUserId(user.getUserId());
                    row.setName(user.getName());
                    row.setCompanyId(user.getCompanyId());
                    userService.save(row);
                    System.out.println(LocalDateTime.now() + " - user with ID: " + user.getUserId() + " synced successfully!");
                }
                System.out.println(LocalDateTime.now() + " - users synced successfully!");
            }
        });
    }
}