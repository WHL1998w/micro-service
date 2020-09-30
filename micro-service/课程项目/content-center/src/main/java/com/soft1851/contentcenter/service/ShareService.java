package com.soft1851.contentcenter.service;

import com.soft1851.contentcenter.domain.dto.ShareDTO;

/**
 * @ClassName
 * @Description TODO
 * @Author wanghuanle
 * @Date
 **/

public interface ShareService {
    /**
     * 获得分享详情
     * @return  ShareDTO
     */
    ShareDTO findById(Integer id);

    String getHello();
}
