package org.example.database.entity;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Table;
import com.mybatisflex.core.handler.Fastjson2TypeHandler;
import lombok.Data;

import java.util.List;

@Data
@Table("company")
public class Company {
    private int id;
    private String name;
    private String city;
    @Column(typeHandler = Fastjson2TypeHandler.class)
    private List<Money> secret;

    @Data
    public static class Money {
        private String money;
    }
}
