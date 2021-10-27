// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePolarxInstanceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("InstanceSeries")
    public String instanceSeries;

    @NameInMap("IsAutoRenew")
    public Boolean isAutoRenew;

    @NameInMap("MasterInstId")
    public String masterInstId;

    @NameInMap("MySQLVersion")
    public Integer mySQLVersion;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("Quantity")
    public Integer quantity;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Specification")
    public String specification;

    @NameInMap("Type")
    public String type;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VswitchId")
    public String vswitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("isHa")
    public Boolean isHa;

    public static CreatePolarxInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarxInstanceRequest self = new CreatePolarxInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolarxInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePolarxInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePolarxInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreatePolarxInstanceRequest setInstanceSeries(String instanceSeries) {
        this.instanceSeries = instanceSeries;
        return this;
    }
    public String getInstanceSeries() {
        return this.instanceSeries;
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

    public CreatePolarxInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreatePolarxInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreatePolarxInstanceRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public CreatePolarxInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePolarxInstanceRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public CreatePolarxInstanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
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

    public CreatePolarxInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreatePolarxInstanceRequest setIsHa(Boolean isHa) {
        this.isHa = isHa;
        return this;
    }
    public Boolean getIsHa() {
        return this.isHa;
    }

}
