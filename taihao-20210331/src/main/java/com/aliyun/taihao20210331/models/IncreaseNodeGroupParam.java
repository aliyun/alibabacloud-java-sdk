// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class IncreaseNodeGroupParam extends TeaModel {
    // addCount
    @NameInMap("addCount")
    public Integer addCount;

    // applicationConfigs
    @NameInMap("applicationConfigs")
    public java.util.List<ApplicationConfigParam> applicationConfigs;

    // autoRenew
    @NameInMap("autoRenew")
    public Boolean autoRenew;

    // autoRenewPeriod
    @NameInMap("autoRenewPeriod")
    public Integer autoRenewPeriod;

    // autoRenewPeriodUnit
    @NameInMap("autoRenewPeriodUnit")
    public String autoRenewPeriodUnit;

    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // nodeGroupId
    @NameInMap("nodeGroupId")
    public String nodeGroupId;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // period
    @NameInMap("period")
    public Integer period;

    // periodUnit
    @NameInMap("periodUnit")
    public String periodUnit;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static IncreaseNodeGroupParam build(java.util.Map<String, ?> map) throws Exception {
        IncreaseNodeGroupParam self = new IncreaseNodeGroupParam();
        return TeaModel.build(map, self);
    }

    public IncreaseNodeGroupParam setAddCount(Integer addCount) {
        this.addCount = addCount;
        return this;
    }
    public Integer getAddCount() {
        return this.addCount;
    }

    public IncreaseNodeGroupParam setApplicationConfigs(java.util.List<ApplicationConfigParam> applicationConfigs) {
        this.applicationConfigs = applicationConfigs;
        return this;
    }
    public java.util.List<ApplicationConfigParam> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    public IncreaseNodeGroupParam setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public IncreaseNodeGroupParam setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public IncreaseNodeGroupParam setAutoRenewPeriodUnit(String autoRenewPeriodUnit) {
        this.autoRenewPeriodUnit = autoRenewPeriodUnit;
        return this;
    }
    public String getAutoRenewPeriodUnit() {
        return this.autoRenewPeriodUnit;
    }

    public IncreaseNodeGroupParam setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public IncreaseNodeGroupParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public IncreaseNodeGroupParam setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public IncreaseNodeGroupParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public IncreaseNodeGroupParam setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public IncreaseNodeGroupParam setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public IncreaseNodeGroupParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
