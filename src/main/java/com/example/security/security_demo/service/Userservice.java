package com.example.security.security_demo.service;

import com.example.security.security_demo.model.QUser;
import com.example.security.security_demo.model.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class Userservice {
    private final EntityManager entityManager;

    public UserDetails loadUser(String userId, String password) {
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("id", userId);
        requestBody.put("password", password);

        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        QUser qUser = QUser.user;

        User user = queryFactory
                .select(qUser)
                .from(qUser)
                .where(qUser.user_id.eq(userId))
                .where(qUser.user_pw.eq(password))
                .fetchOne();
        log.info("user: {}", user);
        //User user = storeUserProxy.accountLogin(requestBody);
        return user;
    }
}
