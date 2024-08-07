package com.xuon.project.service.impl.inner;

import com.xuon.project.service.InnerUserInterfaceInfoService;
import com.xuon.project.service.UserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;


import javax.annotation.Resource;

/**
* @author Austin
* 内部用户接口信息服务实现类
*/
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    /**
     * 调用接口统计
     *
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return  userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }
}




