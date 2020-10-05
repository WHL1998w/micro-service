package com.soft1851.contentcenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class UserDto {
    /**
     * Id
     */
    private Integer id;

    /**
     * 微信昵称
     */
    private String wxNickname;
}
