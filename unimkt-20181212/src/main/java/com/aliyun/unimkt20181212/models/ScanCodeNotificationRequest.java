// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ScanCodeNotificationRequest extends TeaModel {
    @NameInMap("Age")
    public Integer age;

    @NameInMap("AlipayOpenId")
    public String alipayOpenId;

    @NameInMap("ApplyPrice")
    public Integer applyPrice;

    @NameInMap("BizResult")
    public String bizResult;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BrandNick")
    public String brandNick;

    @NameInMap("BrandUserId")
    public String brandUserId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ChargeTag")
    public String chargeTag;

    @NameInMap("Cid")
    public String cid;

    @NameInMap("CommodityId")
    public String commodityId;

    @NameInMap("CostDetail")
    public String costDetail;

    @NameInMap("DeviceCode")
    public String deviceCode;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("HolderId")
    public String holderId;

    @NameInMap("OuterCode")
    public String outerCode;

    @NameInMap("Phase")
    public String phase;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("QueryStr")
    public String queryStr;

    @NameInMap("RealCostAmount")
    public String realCostAmount;

    @NameInMap("SalePrice")
    public Integer salePrice;

    @NameInMap("Sex")
    public String sex;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("V")
    public String v;

    public static ScanCodeNotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanCodeNotificationRequest self = new ScanCodeNotificationRequest();
        return TeaModel.build(map, self);
    }

    public ScanCodeNotificationRequest setAge(Integer age) {
        this.age = age;
        return this;
    }
    public Integer getAge() {
        return this.age;
    }

    public ScanCodeNotificationRequest setAlipayOpenId(String alipayOpenId) {
        this.alipayOpenId = alipayOpenId;
        return this;
    }
    public String getAlipayOpenId() {
        return this.alipayOpenId;
    }

    public ScanCodeNotificationRequest setApplyPrice(Integer applyPrice) {
        this.applyPrice = applyPrice;
        return this;
    }
    public Integer getApplyPrice() {
        return this.applyPrice;
    }

    public ScanCodeNotificationRequest setBizResult(String bizResult) {
        this.bizResult = bizResult;
        return this;
    }
    public String getBizResult() {
        return this.bizResult;
    }

    public ScanCodeNotificationRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ScanCodeNotificationRequest setBrandNick(String brandNick) {
        this.brandNick = brandNick;
        return this;
    }
    public String getBrandNick() {
        return this.brandNick;
    }

    public ScanCodeNotificationRequest setBrandUserId(String brandUserId) {
        this.brandUserId = brandUserId;
        return this;
    }
    public String getBrandUserId() {
        return this.brandUserId;
    }

    public ScanCodeNotificationRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public ScanCodeNotificationRequest setChargeTag(String chargeTag) {
        this.chargeTag = chargeTag;
        return this;
    }
    public String getChargeTag() {
        return this.chargeTag;
    }

    public ScanCodeNotificationRequest setCid(String cid) {
        this.cid = cid;
        return this;
    }
    public String getCid() {
        return this.cid;
    }

    public ScanCodeNotificationRequest setCommodityId(String commodityId) {
        this.commodityId = commodityId;
        return this;
    }
    public String getCommodityId() {
        return this.commodityId;
    }

    public ScanCodeNotificationRequest setCostDetail(String costDetail) {
        this.costDetail = costDetail;
        return this;
    }
    public String getCostDetail() {
        return this.costDetail;
    }

    public ScanCodeNotificationRequest setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public ScanCodeNotificationRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public ScanCodeNotificationRequest setHolderId(String holderId) {
        this.holderId = holderId;
        return this;
    }
    public String getHolderId() {
        return this.holderId;
    }

    public ScanCodeNotificationRequest setOuterCode(String outerCode) {
        this.outerCode = outerCode;
        return this;
    }
    public String getOuterCode() {
        return this.outerCode;
    }

    public ScanCodeNotificationRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public ScanCodeNotificationRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    public ScanCodeNotificationRequest setQueryStr(String queryStr) {
        this.queryStr = queryStr;
        return this;
    }
    public String getQueryStr() {
        return this.queryStr;
    }

    public ScanCodeNotificationRequest setRealCostAmount(String realCostAmount) {
        this.realCostAmount = realCostAmount;
        return this;
    }
    public String getRealCostAmount() {
        return this.realCostAmount;
    }

    public ScanCodeNotificationRequest setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
        return this;
    }
    public Integer getSalePrice() {
        return this.salePrice;
    }

    public ScanCodeNotificationRequest setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public String getSex() {
        return this.sex;
    }

    public ScanCodeNotificationRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ScanCodeNotificationRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ScanCodeNotificationRequest setV(String v) {
        this.v = v;
        return this;
    }
    public String getV() {
        return this.v;
    }

}
