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

    public AllocateEipAddressProRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateEipAddressProRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public AllocateEipAddressProRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AllocateEipAddressProRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public AllocateEipAddressProRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public AllocateEipAddressProRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public AllocateEipAddressProRequest setNetmode(String netmode) {
        this.netmode = netmode;
        return this;
    }
    public String getNetmode() {
        return this.netmode;
    }

    public AllocateEipAddressProRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public AllocateEipAddressProRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public AllocateEipAddressProRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public AllocateEipAddressProRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public AllocateEipAddressProRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AllocateEipAddressProRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
