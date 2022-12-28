package com.atguigu.gulimall.order.service;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 
 *
 * @author xushunlong
 * @email 1061407277@qq.com
 * @date 2022-12-28 20:53:06
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

