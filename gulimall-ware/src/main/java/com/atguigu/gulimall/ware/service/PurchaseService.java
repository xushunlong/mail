package com.atguigu.gulimall.ware.service;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 采购信息
 *
 * @author xushunlong
 * @email 1061407277@qq.com
 * @date 2022-12-28 21:25:35
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

