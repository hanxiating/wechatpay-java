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
import java.util.List;

/** Materials */
public class Materials {
  /** 成功的物料码列表 说明：成功的物料码列表 */
  @SerializedName("material_list")
  private List<MaterialInfo> materialList;

  public List<MaterialInfo> getMaterialList() {
    return materialList;
  }

  public void setMaterialList(List<MaterialInfo> materialList) {
    this.materialList = materialList;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Materials {\n");
    sb.append("    materialList: ").append(toIndentedString(materialList)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
