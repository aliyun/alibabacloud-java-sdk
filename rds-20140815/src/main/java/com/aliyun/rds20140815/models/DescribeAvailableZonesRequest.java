// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableZonesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("EvaluateResource")
    public Boolean evaluateResource;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("DispenseMode")
    public String dispenseMode;

    public static DescribeAvailableZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableZonesRequest self = new DescribeAvailableZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableZonesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAvailableZonesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAvailableZonesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAvailableZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableZonesRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeAvailableZonesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeAvailableZonesRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeAvailableZonesRequest setEvaluateResource(Boolean evaluateResource) {
        this.evaluateResource = evaluateResource;
        return this;
    }
    public Boolean getEvaluateResource() {
        return this.evaluateResource;
    }

    public DescribeAvailableZonesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeAvailableZonesRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeAvailableZonesRequest setDispenseMode(String dispenseMode) {
        this.dispenseMode = dispenseMode;
        return this;
    }
    public String getDispenseMode() {
        return this.dispenseMode;
    }

}
