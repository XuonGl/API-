package com.xuon.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuon.model.entity.InterfaceInfo;


/**
* @author Austin
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-06-27 20:15:06
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
