// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateClusterPaymentTypeParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // nodeGroupId
    @NameInMap("nodeGroupIds")
    public java.util.List<String> nodeGroupIds;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // paymentType
    @NameInMap("paymentType")
    public String paymentType;

    // period
    @NameInMap("period")
    public Long period;

    // periodUnit
    @NameInMap("periodUnit")
    public String periodUnit;

    // promotionOption
    @NameInMap("promotionOption")
    public PromotionOption promotionOption;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // targetExpireTimeMillis
    @NameInMap("targetExpireTimeMillis")
    public Long targetExpireTimeMillis;

    // token
    @NameInMap("token")
    public String token;

    public static UpdateClusterPaymentTypeParam build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterPaymentTypeParam self = new UpdateClusterPaymentTypeParam();
        return TeaModel.build(map, self);
    }

    public UpdateClusterPaymentTypeParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateClusterPaymentTypeParam setNodeGroupIds(java.util.List<String> nodeGroupIds) {
        this.nodeGroupIds = nodeGroupIds;
        return this;
    }
    public java.util.List<String> getNodeGroupIds() {
        return this.nodeGroupIds;
    }

    public UpdateClusterPaymentTypeParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public UpdateClusterPaymentTypeParam setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public UpdateClusterPaymentTypeParam setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public UpdateClusterPaymentTypeParam setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public UpdateClusterPaymentTypeParam setPromotionOption(PromotionOption promotionOption) {
        this.promotionOption = promotionOption;
        return this;
    }
    public PromotionOption getPromotionOption() {
        return this.promotionOption;
    }

    public UpdateClusterPaymentTypeParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public UpdateClusterPaymentTypeParam setTargetExpireTimeMillis(Long targetExpireTimeMillis) {
        this.targetExpireTimeMillis = targetExpireTimeMillis;
        return this;
    }
    public Long getTargetExpireTimeMillis() {
        return this.targetExpireTimeMillis;
    }

    public UpdateClusterPaymentTypeParam setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
