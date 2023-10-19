// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class RefundNoticeParam extends TeaModel {
    @NameInMap("aliuid")
    public Long aliuid;

    @NameInMap("aliyunProduceCode")
    public String aliyunProduceCode;

    @NameInMap("commodityCode")
    public String commodityCode;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("newExpireTime")
    public Object newExpireTime;

    @NameInMap("orderIds")
    public java.util.List<Long> orderIds;

    @NameInMap("refundParamMap")
    public java.util.Map<String, String> refundParamMap;

    @NameInMap("refundType")
    public String refundType;

    public static RefundNoticeParam build(java.util.Map<String, ?> map) throws Exception {
        RefundNoticeParam self = new RefundNoticeParam();
        return TeaModel.build(map, self);
    }

    public RefundNoticeParam setAliuid(Long aliuid) {
        this.aliuid = aliuid;
        return this;
    }
    public Long getAliuid() {
        return this.aliuid;
    }

    public RefundNoticeParam setAliyunProduceCode(String aliyunProduceCode) {
        this.aliyunProduceCode = aliyunProduceCode;
        return this;
    }
    public String getAliyunProduceCode() {
        return this.aliyunProduceCode;
    }

    public RefundNoticeParam setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public RefundNoticeParam setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RefundNoticeParam setNewExpireTime(Object newExpireTime) {
        this.newExpireTime = newExpireTime;
        return this;
    }
    public Object getNewExpireTime() {
        return this.newExpireTime;
    }

    public RefundNoticeParam setOrderIds(java.util.List<Long> orderIds) {
        this.orderIds = orderIds;
        return this;
    }
    public java.util.List<Long> getOrderIds() {
        return this.orderIds;
    }

    public RefundNoticeParam setRefundParamMap(java.util.Map<String, String> refundParamMap) {
        this.refundParamMap = refundParamMap;
        return this;
    }
    public java.util.Map<String, String> getRefundParamMap() {
        return this.refundParamMap;
    }

    public RefundNoticeParam setRefundType(String refundType) {
        this.refundType = refundType;
        return this;
    }
    public String getRefundType() {
        return this.refundType;
    }

}
