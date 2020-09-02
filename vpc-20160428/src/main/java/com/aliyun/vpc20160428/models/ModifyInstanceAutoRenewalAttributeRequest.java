// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRenewalAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("PricingCycle")
    @Validation(required = true)
    public String pricingCycle;

    @NameInMap("Duration")
    @Validation(required = true)
    public Integer duration;

    @NameInMap("InstanceType")
    @Validation(required = true)
    public String instanceType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RenewalStatus")
    public String renewalStatus;

    public static ModifyInstanceAutoRenewalAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoRenewalAttributeRequest self = new ModifyInstanceAutoRenewalAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoRenewalAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceAutoRenewalAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceAutoRenewalAttributeRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public ModifyInstanceAutoRenewalAttributeRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public ModifyInstanceAutoRenewalAttributeRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyInstanceAutoRenewalAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceAutoRenewalAttributeRequest setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

}
