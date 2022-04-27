// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerRequest extends TeaModel {
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("BillingConfig")
    public CreateLoadBalancerRequestBillingConfig billingConfig;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CommonBandwidthPackageId")
    public String commonBandwidthPackageId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EnableCrossZone")
    public Boolean enableCrossZone;

    @NameInMap("EnableTrafficAffinity")
    public Boolean enableTrafficAffinity;

    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    @NameInMap("LoadBalancerType")
    public String loadBalancerType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityGroups")
    public java.util.List<String> securityGroups;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneMappings")
    public java.util.List<CreateLoadBalancerRequestZoneMappings> zoneMappings;

    public static CreateLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerRequest self = new CreateLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerRequest setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    public CreateLoadBalancerRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public CreateLoadBalancerRequest setBillingConfig(CreateLoadBalancerRequestBillingConfig billingConfig) {
        this.billingConfig = billingConfig;
        return this;
    }
    public CreateLoadBalancerRequestBillingConfig getBillingConfig() {
        return this.billingConfig;
    }

    public CreateLoadBalancerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLoadBalancerRequest setCommonBandwidthPackageId(String commonBandwidthPackageId) {
        this.commonBandwidthPackageId = commonBandwidthPackageId;
        return this;
    }
    public String getCommonBandwidthPackageId() {
        return this.commonBandwidthPackageId;
    }

    public CreateLoadBalancerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateLoadBalancerRequest setEnableCrossZone(Boolean enableCrossZone) {
        this.enableCrossZone = enableCrossZone;
        return this;
    }
    public Boolean getEnableCrossZone() {
        return this.enableCrossZone;
    }

    public CreateLoadBalancerRequest setEnableTrafficAffinity(Boolean enableTrafficAffinity) {
        this.enableTrafficAffinity = enableTrafficAffinity;
        return this;
    }
    public Boolean getEnableTrafficAffinity() {
        return this.enableTrafficAffinity;
    }

    public CreateLoadBalancerRequest setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public CreateLoadBalancerRequest setLoadBalancerType(String loadBalancerType) {
        this.loadBalancerType = loadBalancerType;
        return this;
    }
    public String getLoadBalancerType() {
        return this.loadBalancerType;
    }

    public CreateLoadBalancerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLoadBalancerRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLoadBalancerRequest setSecurityGroups(java.util.List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public java.util.List<String> getSecurityGroups() {
        return this.securityGroups;
    }

    public CreateLoadBalancerRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateLoadBalancerRequest setZoneMappings(java.util.List<CreateLoadBalancerRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<CreateLoadBalancerRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class CreateLoadBalancerRequestBillingConfig extends TeaModel {
        @NameInMap("AutoPay")
        public Boolean autoPay;

        // PayByTraffic, PayByBandwidth, PayByLcu, PayBy95, PayByOld95, PayBy96
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        // PrePay, PostPay
        @NameInMap("PayType")
        public String payType;

        @NameInMap("Period")
        public Integer period;

        // Month, Year, Day
        @NameInMap("PricingCycle")
        public String pricingCycle;

        @NameInMap("Specification")
        public String specification;

        public static CreateLoadBalancerRequestBillingConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestBillingConfig self = new CreateLoadBalancerRequestBillingConfig();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestBillingConfig setAutoPay(Boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        public CreateLoadBalancerRequestBillingConfig setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public CreateLoadBalancerRequestBillingConfig setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public CreateLoadBalancerRequestBillingConfig setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public CreateLoadBalancerRequestBillingConfig setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public CreateLoadBalancerRequestBillingConfig setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

    }

    public static class CreateLoadBalancerRequestZoneMappings extends TeaModel {
        // 公网ipId
        @NameInMap("AllocationId")
        public String allocationId;

        // 私网ip
        @NameInMap("PrivateIPv4Address")
        public String privateIPv4Address;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateLoadBalancerRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestZoneMappings self = new CreateLoadBalancerRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestZoneMappings setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public CreateLoadBalancerRequestZoneMappings setPrivateIPv4Address(String privateIPv4Address) {
            this.privateIPv4Address = privateIPv4Address;
            return this;
        }
        public String getPrivateIPv4Address() {
            return this.privateIPv4Address;
        }

        public CreateLoadBalancerRequestZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateLoadBalancerRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
