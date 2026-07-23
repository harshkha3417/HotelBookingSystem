package com.Harsh.projects.airBnbApp.util;

import com.Harsh.projects.airBnbApp.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class AppUtils {

    public static User getCurrentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
