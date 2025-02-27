// Copyright 2021 Tencent Inc. All rights reserved.
//
// 营销加价购对外API
//
// 指定服务商可通过该接口报名加价购活动、查询某个区域内的加价购活动列表、锁定加价活动购资格以及解锁加价购活动资格。
//
// API version: 1.3.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.retailstore.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** ActApplyInfo */
public class ActApplyInfo {
  /** 门店信息 说明：门店信息 */
  @SerializedName("store_info")
  private StoreInfo storeInfo;
  /** 商品原价 说明：品牌加价购活动商品的原价，该价格会在加价购小程序插件中展示（单位：分） */
  @SerializedName("goods_original_price")
  private Long goodsOriginalPrice;

  public StoreInfo getStoreInfo() {
    return storeInfo;
  }

  public void setStoreInfo(StoreInfo storeInfo) {
    this.storeInfo = storeInfo;
  }

  public Long getGoodsOriginalPrice() {
    return goodsOriginalPrice;
  }

  public void setGoodsOriginalPrice(Long goodsOriginalPrice) {
    this.goodsOriginalPrice = goodsOriginalPrice;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActApplyInfo {\n");
    sb.append("    storeInfo: ").append(toIndentedString(storeInfo)).append("\n");
    sb.append("    goodsOriginalPrice: ").append(toIndentedString(goodsOriginalPrice)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
