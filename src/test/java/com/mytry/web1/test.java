package com.mytry.web1;

import com.mytry.web1.Dao.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class test {

    @Test
    public void test1() {
        UserInfo userInfo = new UserInfo("sony", 26);

        System.out.println(userInfo);

        StringBuffer info = userInfo.getInfo();
        info.replace(1, 3, "top");

        int a = userInfo.getAge();
        a = 6;

        userInfo.getName().replace("s", "T");

        // int age = userInfo.getAge();


        System.out.println(userInfo);
    }
}
