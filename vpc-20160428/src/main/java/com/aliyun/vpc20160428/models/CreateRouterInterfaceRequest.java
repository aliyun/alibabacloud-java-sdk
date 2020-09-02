// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouterInterfaceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Role")
    @Validation(required = true)
    public String role;

    @NameInMap("OppositeRegionId")
    @Validation(required = true)
    public String oppositeRegionId;

    @NameInMap("Spec")
    @Validation(required = true)
    public String spec;

    @NameInMap("RouterType")
    @Validation(required = true)
    public String routerType;

    @NameInMap("RouterId")
    @Validation(required = true)
    public String routerId;

    @NameInMap("OppositeInterfaceId")
    public String oppositeInterfaceId;

    @NameInMap("OppositeRouterId")
    public String oppositeRouterId;

    @NameInMap("OppositeRouterType")
    public String oppositeRouterType;

    @NameInMap("OppositeInterfaceOwnerId")
    public String oppositeInterfaceOwnerId;

    @NameInMap("HealthCheckSourceIp")
    public String healthCheckSourceIp;

    @NameInMap("HealthCheckTargetIp")
    public String healthCheckTargetIp;

    @NameInMap("AccessPointId")
    public String accessPointId;

    @NameInMap("OppositeAccessPointId")
    public String oppositeAccessPointId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateRouterInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouterInterfaceRequest self = new CreateRouterInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouterInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRouterInterfaceRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateRouterInterfaceRequest setOppositeRegionId(String oppositeRegionId) {
        this.oppositeRegionId = oppositeRegionId;
        return this;
    }
    public String getOppositeRegionId() {
        return this.oppositeRegionId;
    }

    public CreateRouterInterfaceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateRouterInterfaceRequest setRouterType(String routerType) {
        this.routerType = routerType;
        return this;
    }
    public String getRouterType() {
        return this.routerType;
    }

    public CreateRouterInterfaceRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public CreateRouterInterfaceRequest setOppositeInterfaceId(String oppositeInterfaceId) {
        this.oppositeInterfaceId = oppositeInterfaceId;
        return this;
    }
    public String getOppositeInterfaceId() {
        return this.oppositeInterfaceId;
    }

    public CreateRouterInterfaceRequest setOppositeRouterId(String oppositeRouterId) {
        this.oppositeRouterId = oppositeRouterId;
        return this;
    }
    public String getOppositeRouterId() {
        return this.oppositeRouterId;
    }

    public CreateRouterInterfaceRequest setOppositeRouterType(String oppositeRouterType) {
        this.oppositeRouterType = oppositeRouterType;
        return this;
    }
    public String getOppositeRouterType() {
        return this.oppositeRouterType;
    }

    public CreateRouterInterfaceRequest setOppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
        this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
        return this;
    }
    public String getOppositeInterfaceOwnerId() {
        return this.oppositeInterfaceOwnerId;
    }

    public CreateRouterInterfaceRequest setHealthCheckSourceIp(String healthCheckSourceIp) {
        this.healthCheckSourceIp = healthCheckSourceIp;
        return this;
    }
    public String getHealthCheckSourceIp() {
        return this.healthCheckSourceIp;
    }

    public CreateRouterInterfaceRequest setHealthCheckTargetIp(String healthCheckTargetIp) {
        this.healthCheckTargetIp = healthCheckTargetIp;
        return this;
    }
    public String getHealthCheckTargetIp() {
        return this.healthCheckTargetIp;
    }

    public CreateRouterInterfaceRequest setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public CreateRouterInterfaceRequest setOppositeAccessPointId(String oppositeAccessPointId) {
        this.oppositeAccessPointId = oppositeAccessPointId;
        return this;
    }
    public String getOppositeAccessPointId() {
        return this.oppositeAccessPointId;
    }

    public CreateRouterInterfaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRouterInterfaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRouterInterfaceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateRouterInterfaceRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateRouterInterfaceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateRouterInterfaceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateRouterInterfaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
