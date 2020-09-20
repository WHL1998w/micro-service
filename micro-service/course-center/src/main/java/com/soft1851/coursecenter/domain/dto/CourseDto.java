package com.soft1851.coursecenter.domain.dto;

import com.soft1851.coursecenter.domain.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/09/20
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseDto {
    private Course course;
    private String userName;
    private String avatarUrl;
}

