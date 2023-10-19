// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CssPurchase extends TeaModel {
    @NameInMap("chargeType")
    public String chargeType;

    @NameInMap("commodityCode")
    public String commodityCode;

    @NameInMap("endDate")
    public Long endDate;

    @NameInMap("gmtCreate")
    public Long gmtCreate;

    @NameInMap("instanceComponents")
    public java.util.List<CssInstanceComponent> instanceComponents;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("orderType")
    public String orderType;

    @NameInMap("purchaseParams")
    public java.util.Map<String, String> purchaseParams;

    @NameInMap("startDate")
    public Long startDate;

    public static CssPurchase build(java.util.Map<String, ?> map) throws Exception {
        CssPurchase self = new CssPurchase();
        return TeaModel.build(map, self);
    }

    public CssPurchase setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CssPurchase setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CssPurchase setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public CssPurchase setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public CssPurchase setInstanceComponents(java.util.List<CssInstanceComponent> instanceComponents) {
        this.instanceComponents = instanceComponents;
        return this;
    }
    public java.util.List<CssInstanceComponent> getInstanceComponents() {
        return this.instanceComponents;
    }

    public CssPurchase setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CssPurchase setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CssPurchase setPurchaseParams(java.util.Map<String, String> purchaseParams) {
        this.purchaseParams = purchaseParams;
        return this;
    }
    public java.util.Map<String, String> getPurchaseParams() {
        return this.purchaseParams;
    }

    public CssPurchase setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
