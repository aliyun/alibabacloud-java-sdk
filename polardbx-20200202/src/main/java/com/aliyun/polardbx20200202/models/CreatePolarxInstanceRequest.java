// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePolarxInstanceRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Quantity")
    public Integer quantity;

    @NameInMap("InstanceSeries")
    public String instanceSeries;

    @NameInMap("Specification")
    public String specification;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VswitchId")
    public String vswitchId;

    @NameInMap("isHa")
    public Boolean isHa;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("IsAutoRenew")
    public Boolean isAutoRenew;

    @NameInMap("MasterInstId")
    public String masterInstId;

    @NameInMap("MySQLVersion")
    public Integer mySQLVersion;

    public static CreatePolarxInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarxInstanceRequest self = new CreatePolarxInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolarxInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePolarxInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePolarxInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreatePolarxInstanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreatePolarxInstanceRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public CreatePolarxInstanceRequest setInstanceSeries(String instanceSeries) {
        this.instanceSeries = instanceSeries;
        return this;
    }
    public String getInstanceSeries() {
        return this.instanceSeries;
    }

    public CreatePolarxInstanceRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public CreatePolarxInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePolarxInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreatePolarxInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreatePolarxInstanceRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public CreatePolarxInstanceRequest setIsHa(Boolean isHa) {
        this.isHa = isHa;
        return this;
    }
    public Boolean getIsHa() {
        return this.isHa;
    }

    public CreatePolarxInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreatePolarxInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreatePolarxInstanceRequest setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }
    public Boolean getIsAutoRenew() {
        return this.isAutoRenew;
    }

    public CreatePolarxInstanceRequest setMasterInstId(String masterInstId) {
        this.masterInstId = masterInstId;
        return this;
    }
    public String getMasterInstId() {
        return this.masterInstId;
    }

    public CreatePolarxInstanceRequest setMySQLVersion(Integer mySQLVersion) {
        this.mySQLVersion = mySQLVersion;
        return this;
    }
    public Integer getMySQLVersion() {
        return this.mySQLVersion;
    }

}
