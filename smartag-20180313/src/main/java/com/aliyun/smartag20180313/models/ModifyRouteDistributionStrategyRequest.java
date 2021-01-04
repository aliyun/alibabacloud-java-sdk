// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyRouteDistributionStrategyRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("HcInstanceId")
    public String hcInstanceId;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("DestCidrBlock")
    public String destCidrBlock;

    @NameInMap("RouteSource")
    public String routeSource;

    @NameInMap("RouteDistribution")
    public String routeDistribution;

    public static ModifyRouteDistributionStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteDistributionStrategyRequest self = new ModifyRouteDistributionStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRouteDistributionStrategyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyRouteDistributionStrategyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyRouteDistributionStrategyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyRouteDistributionStrategyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyRouteDistributionStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyRouteDistributionStrategyRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifyRouteDistributionStrategyRequest setHcInstanceId(String hcInstanceId) {
        this.hcInstanceId = hcInstanceId;
        return this;
    }
    public String getHcInstanceId() {
        return this.hcInstanceId;
    }

    public ModifyRouteDistributionStrategyRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ModifyRouteDistributionStrategyRequest setDestCidrBlock(String destCidrBlock) {
        this.destCidrBlock = destCidrBlock;
        return this;
    }
    public String getDestCidrBlock() {
        return this.destCidrBlock;
    }

    public ModifyRouteDistributionStrategyRequest setRouteSource(String routeSource) {
        this.routeSource = routeSource;
        return this;
    }
    public String getRouteSource() {
        return this.routeSource;
    }

    public ModifyRouteDistributionStrategyRequest setRouteDistribution(String routeDistribution) {
        this.routeDistribution = routeDistribution;
        return this;
    }
    public String getRouteDistribution() {
        return this.routeDistribution;
    }

}
