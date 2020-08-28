// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatGatewayRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("BandwidthPackage")
    public java.util.List<CreateNatGatewayRequestBandwidthPackage> bandwidthPackage;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("NatType")
    public String natType;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    public static CreateNatGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNatGatewayRequest self = new CreateNatGatewayRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateNatGatewayRequestBandwidthPackage extends TeaModel {
        @NameInMap("IpCount")
        @Validation(required = true)
        public Integer ipCount;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public Integer bandwidth;

        @NameInMap("Zone")
        @Validation(required = true)
        public String zone;

        @NameInMap("ISP")
        @Validation(required = true)
        public String ISP;

        public static CreateNatGatewayRequestBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            CreateNatGatewayRequestBandwidthPackage self = new CreateNatGatewayRequestBandwidthPackage();
            return TeaModel.build(map, self);
        }

    }

}
