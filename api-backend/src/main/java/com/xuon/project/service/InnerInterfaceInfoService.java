package com.xuon.project.service;


import com.xuon.model.entity.InterfaceInfo;

/**
* @author Austin
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-06-27 20:15:06
*/
public interface InnerInterfaceInfoService {
    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
