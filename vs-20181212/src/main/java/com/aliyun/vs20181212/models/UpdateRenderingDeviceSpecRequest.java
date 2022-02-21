// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateRenderingDeviceSpecRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Long autoRenewPeriod;

    @NameInMap("Description")
    public String description;

    @NameInMap("EffectiveTime")
    public Boolean effectiveTime;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("Specification")
    public String specification;

    public static UpdateRenderingDeviceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRenderingDeviceSpecRequest self = new UpdateRenderingDeviceSpecRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRenderingDeviceSpecRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public UpdateRenderingDeviceSpecRequest setAutoRenewPeriod(Long autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Long getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public UpdateRenderingDeviceSpecRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateRenderingDeviceSpecRequest setEffectiveTime(Boolean effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public Boolean getEffectiveTime() {
        return this.effectiveTime;
    }

    public UpdateRenderingDeviceSpecRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public UpdateRenderingDeviceSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateRenderingDeviceSpecRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public UpdateRenderingDeviceSpecRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public UpdateRenderingDeviceSpecRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

}
