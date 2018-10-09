package com.lettin.apimanager.mapper;

import com.lettin.apimanager.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository {
    User findByLoginName(String currentLoginName);
}
