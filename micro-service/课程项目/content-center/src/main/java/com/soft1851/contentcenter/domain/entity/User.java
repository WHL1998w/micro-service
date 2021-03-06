package com.soft1851.contentcenter.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @ClassName
 * @Description TODO
 * @Author wanghuanle
 * @Date
 **/

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {
    private Integer id;
    private String wxId;
    private String wxNickname;
    private String roles;
    private String avatarUrl;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer bonus;
}
