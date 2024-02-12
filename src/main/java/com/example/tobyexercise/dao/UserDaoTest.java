package com.example.tobyexercise.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);
        // AnnotationConfigApplicationContext -> @Configuration이 붙은 java code를
        // 설정정보로 사용하기 위한 애플리케이션 컨텍스트 클래스

        // getBean -> "userDao"라는 메소드를 통해 만든 UserDao 오브젝트를 가져온다는 뜻
    }
}
