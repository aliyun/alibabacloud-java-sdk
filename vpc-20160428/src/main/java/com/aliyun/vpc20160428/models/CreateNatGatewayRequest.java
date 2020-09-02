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

    public CreateNatGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNatGatewayRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateNatGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateNatGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNatGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNatGatewayRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateNatGatewayRequest setBandwidthPackage(java.util.List<CreateNatGatewayRequestBandwidthPackage> bandwidthPackage) {
        this.bandwidthPackage = bandwidthPackage;
        return this;
    }
    public java.util.List<CreateNatGatewayRequestBandwidthPackage> getBandwidthPackage() {
        return this.bandwidthPackage;
    }

    public CreateNatGatewayRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateNatGatewayRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateNatGatewayRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreateNatGatewayRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateNatGatewayRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateNatGatewayRequest setNatType(String natType) {
        this.natType = natType;
        return this;
    }
    public String getNatType() {
        return this.natType;
    }

    public CreateNatGatewayRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
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

        public CreateNatGatewayRequestBandwidthPackage setIpCount(Integer ipCount) {
            this.ipCount = ipCount;
            return this;
        }
        public Integer getIpCount() {
            return this.ipCount;
        }

        public CreateNatGatewayRequestBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public CreateNatGatewayRequestBandwidthPackage setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public CreateNatGatewayRequestBandwidthPackage setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

    }

}
