// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipAddressProRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Bandwidth")
    public String bandwidth;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("ISP")
    public String ISP;

    @NameInMap("Netmode")
    public String netmode;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AllocateEipAddressProRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressProRequest self = new AllocateEipAddressProRequest();
        return TeaModel.build(map, self);
    }

}
