// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateAutoRenewParam extends TeaModel {
    // 是否自动续费
    @NameInMap("autoRenew")
    public Boolean autoRenew;

    // 机器ID
    @NameInMap("instanceIds")
    public java.util.List<String> instanceIds;

    // 抵扣天数
    @NameInMap("offsetDays")
    public Integer offsetDays;

    // 操作用户
    @NameInMap("operateUserId")
    public String operateUserId;

    // 续费时长
    @NameInMap("renewDuration")
    public Integer renewDuration;

    // 续费时长单位
    @NameInMap("renewDurationUnit")
    public String renewDurationUnit;

    // 主账号
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // 用户ID
    @NameInMap("userId")
    public Long userId;

    public static UpdateAutoRenewParam build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoRenewParam self = new UpdateAutoRenewParam();
        return TeaModel.build(map, self);
    }

    public UpdateAutoRenewParam setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public UpdateAutoRenewParam setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public UpdateAutoRenewParam setOffsetDays(Integer offsetDays) {
        this.offsetDays = offsetDays;
        return this;
    }
    public Integer getOffsetDays() {
        return this.offsetDays;
    }

    public UpdateAutoRenewParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public UpdateAutoRenewParam setRenewDuration(Integer renewDuration) {
        this.renewDuration = renewDuration;
        return this;
    }
    public Integer getRenewDuration() {
        return this.renewDuration;
    }

    public UpdateAutoRenewParam setRenewDurationUnit(String renewDurationUnit) {
        this.renewDurationUnit = renewDurationUnit;
        return this;
    }
    public String getRenewDurationUnit() {
        return this.renewDurationUnit;
    }

    public UpdateAutoRenewParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public UpdateAutoRenewParam setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
