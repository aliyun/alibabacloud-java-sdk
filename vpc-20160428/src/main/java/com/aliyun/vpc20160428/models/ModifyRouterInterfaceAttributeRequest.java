// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceAttributeRequest extends TeaModel {
    @NameInMap("DeleteHealthCheckIp")
    public Boolean deleteHealthCheckIp;

    @NameInMap("Description")
    public String description;

    @NameInMap("HcRate")
    public Integer hcRate;

    @NameInMap("HcThreshold")
    public Integer hcThreshold;

    @NameInMap("HealthCheckSourceIp")
    public String healthCheckSourceIp;

    @NameInMap("HealthCheckTargetIp")
    public String healthCheckTargetIp;

    @NameInMap("Name")
    public String name;

    @NameInMap("OppositeInterfaceId")
    public String oppositeInterfaceId;

    @NameInMap("OppositeInterfaceOwnerId")
    public Long oppositeInterfaceOwnerId;

    @NameInMap("OppositeRouterId")
    public String oppositeRouterId;

    @NameInMap("OppositeRouterType")
    public String oppositeRouterType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RouterInterfaceId")
    public String routerInterfaceId;

    public static ModifyRouterInterfaceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouterInterfaceAttributeRequest self = new ModifyRouterInterfaceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRouterInterfaceAttributeRequest setDeleteHealthCheckIp(Boolean deleteHealthCheckIp) {
        this.deleteHealthCheckIp = deleteHealthCheckIp;
        return this;
    }
    public Boolean getDeleteHealthCheckIp() {
        return this.deleteHealthCheckIp;
    }

    public ModifyRouterInterfaceAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyRouterInterfaceAttributeRequest setHcRate(Integer hcRate) {
        this.hcRate = hcRate;
        return this;
    }
    public Integer getHcRate() {
        return this.hcRate;
    }

    public ModifyRouterInterfaceAttributeRequest setHcThreshold(Integer hcThreshold) {
        this.hcThreshold = hcThreshold;
        return this;
    }
    public Integer getHcThreshold() {
        return this.hcThreshold;
    }

    public ModifyRouterInterfaceAttributeRequest setHealthCheckSourceIp(String healthCheckSourceIp) {
        this.healthCheckSourceIp = healthCheckSourceIp;
        return this;
    }
    public String getHealthCheckSourceIp() {
        return this.healthCheckSourceIp;
    }

    public ModifyRouterInterfaceAttributeRequest setHealthCheckTargetIp(String healthCheckTargetIp) {
        this.healthCheckTargetIp = healthCheckTargetIp;
        return this;
    }
    public String getHealthCheckTargetIp() {
        return this.healthCheckTargetIp;
    }

    public ModifyRouterInterfaceAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyRouterInterfaceAttributeRequest setOppositeInterfaceId(String oppositeInterfaceId) {
        this.oppositeInterfaceId = oppositeInterfaceId;
        return this;
    }
    public String getOppositeInterfaceId() {
        return this.oppositeInterfaceId;
    }

    public ModifyRouterInterfaceAttributeRequest setOppositeInterfaceOwnerId(Long oppositeInterfaceOwnerId) {
        this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
        return this;
    }
    public Long getOppositeInterfaceOwnerId() {
        return this.oppositeInterfaceOwnerId;
    }

    public ModifyRouterInterfaceAttributeRequest setOppositeRouterId(String oppositeRouterId) {
        this.oppositeRouterId = oppositeRouterId;
        return this;
    }
    public String getOppositeRouterId() {
        return this.oppositeRouterId;
    }

    public ModifyRouterInterfaceAttributeRequest setOppositeRouterType(String oppositeRouterType) {
        this.oppositeRouterType = oppositeRouterType;
        return this;
    }
    public String getOppositeRouterType() {
        return this.oppositeRouterType;
    }

    public ModifyRouterInterfaceAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyRouterInterfaceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyRouterInterfaceAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyRouterInterfaceAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyRouterInterfaceAttributeRequest setRouterInterfaceId(String routerInterfaceId) {
        this.routerInterfaceId = routerInterfaceId;
        return this;
    }
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

}
