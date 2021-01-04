// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteRouteDistributionStrategyRequest extends TeaModel {
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

    @NameInMap("DestCidrBlock")
    public String destCidrBlock;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("RouteSource")
    public String routeSource;

    public static DeleteRouteDistributionStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteDistributionStrategyRequest self = new DeleteRouteDistributionStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteDistributionStrategyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteRouteDistributionStrategyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteRouteDistributionStrategyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteRouteDistributionStrategyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteRouteDistributionStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRouteDistributionStrategyRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public DeleteRouteDistributionStrategyRequest setDestCidrBlock(String destCidrBlock) {
        this.destCidrBlock = destCidrBlock;
        return this;
    }
    public String getDestCidrBlock() {
        return this.destCidrBlock;
    }

    public DeleteRouteDistributionStrategyRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DeleteRouteDistributionStrategyRequest setRouteSource(String routeSource) {
        this.routeSource = routeSource;
        return this;
    }
    public String getRouteSource() {
        return this.routeSource;
    }

}
