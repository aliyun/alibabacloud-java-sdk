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

}
