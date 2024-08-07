package com.xuon.project.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xuon.model.entity.UserInterfaceInfo;

import java.util.List;


/**
* @author Austin
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-07-04 22:56:52
* @Entity generator.domain.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}



