// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CssInstanceCommodity extends TeaModel {
    @NameInMap("activityId")
    public Long activityId;

    @NameInMap("aliyunProduceCode")
    public String aliyunProduceCode;

    @NameInMap("chargeType")
    public String chargeType;

    @NameInMap("commodityCode")
    public String commodityCode;

    @NameInMap("components")
    public java.util.List<CssInstanceComponent> components;

    @NameInMap("duration")
    public Long duration;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("isFree")
    public Boolean isFree;

    @NameInMap("isPrePayPostCharge")
    public Boolean isPrePayPostCharge;

    @NameInMap("isRenewChange")
    public Boolean isRenewChange;

    @NameInMap("isSyncToSubscription")
    public Boolean isSyncToSubscription;

    @NameInMap("orderParams")
    public java.util.Map<String, String> orderParams;

    @NameInMap("orderType")
    public String orderType;

    @NameInMap("planItemId")
    public Long planItemId;

    @NameInMap("pricingCycle")
    public String pricingCycle;

    @NameInMap("quantity")
    public Long quantity;

    @NameInMap("redeemNoList")
    public java.util.List<String> redeemNoList;

    @NameInMap("redeemOrderType")
    public String redeemOrderType;

    @NameInMap("refundSpecCode")
    public String refundSpecCode;

    @NameInMap("specCode")
    public String specCode;

    @NameInMap("specUpgradeOriginSpecCodes")
    public java.util.List<String> specUpgradeOriginSpecCodes;

    @NameInMap("specifyStartDate")
    public Long specifyStartDate;

    @NameInMap("upgradeInquireFinancialValue")
    public Boolean upgradeInquireFinancialValue;

    public static CssInstanceCommodity build(java.util.Map<String, ?> map) throws Exception {
        CssInstanceCommodity self = new CssInstanceCommodity();
        return TeaModel.build(map, self);
    }

    public CssInstanceCommodity setActivityId(Long activityId) {
        this.activityId = activityId;
        return this;
    }
    public Long getActivityId() {
        return this.activityId;
    }

    public CssInstanceCommodity setAliyunProduceCode(String aliyunProduceCode) {
        this.aliyunProduceCode = aliyunProduceCode;
        return this;
    }
    public String getAliyunProduceCode() {
        return this.aliyunProduceCode;
    }

    public CssInstanceCommodity setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CssInstanceCommodity setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CssInstanceCommodity setComponents(java.util.List<CssInstanceComponent> components) {
        this.components = components;
        return this;
    }
    public java.util.List<CssInstanceComponent> getComponents() {
        return this.components;
    }

    public CssInstanceCommodity setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public CssInstanceCommodity setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CssInstanceCommodity setIsFree(Boolean isFree) {
        this.isFree = isFree;
        return this;
    }
    public Boolean getIsFree() {
        return this.isFree;
    }

    public CssInstanceCommodity setIsPrePayPostCharge(Boolean isPrePayPostCharge) {
        this.isPrePayPostCharge = isPrePayPostCharge;
        return this;
    }
    public Boolean getIsPrePayPostCharge() {
        return this.isPrePayPostCharge;
    }

    public CssInstanceCommodity setIsRenewChange(Boolean isRenewChange) {
        this.isRenewChange = isRenewChange;
        return this;
    }
    public Boolean getIsRenewChange() {
        return this.isRenewChange;
    }

    public CssInstanceCommodity setIsSyncToSubscription(Boolean isSyncToSubscription) {
        this.isSyncToSubscription = isSyncToSubscription;
        return this;
    }
    public Boolean getIsSyncToSubscription() {
        return this.isSyncToSubscription;
    }

    public CssInstanceCommodity setOrderParams(java.util.Map<String, String> orderParams) {
        this.orderParams = orderParams;
        return this;
    }
    public java.util.Map<String, String> getOrderParams() {
        return this.orderParams;
    }

    public CssInstanceCommodity setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CssInstanceCommodity setPlanItemId(Long planItemId) {
        this.planItemId = planItemId;
        return this;
    }
    public Long getPlanItemId() {
        return this.planItemId;
    }

    public CssInstanceCommodity setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CssInstanceCommodity setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public CssInstanceCommodity setRedeemNoList(java.util.List<String> redeemNoList) {
        this.redeemNoList = redeemNoList;
        return this;
    }
    public java.util.List<String> getRedeemNoList() {
        return this.redeemNoList;
    }

    public CssInstanceCommodity setRedeemOrderType(String redeemOrderType) {
        this.redeemOrderType = redeemOrderType;
        return this;
    }
    public String getRedeemOrderType() {
        return this.redeemOrderType;
    }

    public CssInstanceCommodity setRefundSpecCode(String refundSpecCode) {
        this.refundSpecCode = refundSpecCode;
        return this;
    }
    public String getRefundSpecCode() {
        return this.refundSpecCode;
    }

    public CssInstanceCommodity setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public CssInstanceCommodity setSpecUpgradeOriginSpecCodes(java.util.List<String> specUpgradeOriginSpecCodes) {
        this.specUpgradeOriginSpecCodes = specUpgradeOriginSpecCodes;
        return this;
    }
    public java.util.List<String> getSpecUpgradeOriginSpecCodes() {
        return this.specUpgradeOriginSpecCodes;
    }

    public CssInstanceCommodity setSpecifyStartDate(Long specifyStartDate) {
        this.specifyStartDate = specifyStartDate;
        return this;
    }
    public Long getSpecifyStartDate() {
        return this.specifyStartDate;
    }

    public CssInstanceCommodity setUpgradeInquireFinancialValue(Boolean upgradeInquireFinancialValue) {
        this.upgradeInquireFinancialValue = upgradeInquireFinancialValue;
        return this;
    }
    public Boolean getUpgradeInquireFinancialValue() {
        return this.upgradeInquireFinancialValue;
    }

}
