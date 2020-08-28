// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionOccupancyOrderRequest extends TeaModel {
    // description: The ID of the region where the leased line is deployed.; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    // description: The instance ID of the physical connection interface.; 
    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    public String physicalConnectionId;

    // description: Optional. The validity period of a Subscription.; 
    @NameInMap("Period")
    public Integer period;

    // description: Optional. The billing method of the instance. Valid values:* PrePaid: Subscription. If you select this value, you must make sure that your account has enough available funds.* PostPaid (default value): Pay-As-You-Go; 
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    // description: Optional. Indicates whether to pay automatically. Valid values:* true (default value): Pay automatically. If you select this value, you must ensure that your account has enough available funds. Otherwise, the order that is generated is invalid.* false: Generates the order only. No fee is deducted from your account.; 
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // description: Optional. The Subscription cycle. Valid values:* Month* Year; 
    @NameInMap("PricingCycle")
    public String pricingCycle;

    // description: Optional. The token used for client authentication.; 
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreatePhysicalConnectionOccupancyOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionOccupancyOrderRequest self = new CreatePhysicalConnectionOccupancyOrderRequest();
        return TeaModel.build(map, self);
    }

}
