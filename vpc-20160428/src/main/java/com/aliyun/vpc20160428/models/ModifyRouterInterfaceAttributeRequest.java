// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete the health check IP addresses configured on the router interface. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("DeleteHealthCheckIp")
    public Boolean deleteHealthCheckIp;

    /**
     * <p>The description of the router interface.</p>
     * <br>
     * <p>The value must be 2 to 256 characters in length. It must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The rate of health checks. Unit: milliseconds. The recommended value is **2000**. This value specifies the interval at which probe packets are sent during a health check.</p>
     * <br>
     * <p>In this example, **HcThreshold** is set to **8** and **HcRate** is set to **2000**. In this example, probe packets are sent from **HealthCheckSourceIp** (source address) to **HealthCheckTargetIp** (destination address) every 2,000 seconds. If no response is returned for eight consecutive times, the health check fails.</p>
     */
    @NameInMap("HcRate")
    public Integer hcRate;

    /**
     * <p>The healthy threshold. Unit: packets. We recommend that you set the value to **8**. This value specifies the number of probe packets that are sent during a health check.</p>
     */
    @NameInMap("HcThreshold")
    public Integer hcThreshold;

    /**
     * <p>The source IP address that is used to perform health checks. The source IP address must be an idle IP address of the local virtual private cloud (VPC).</p>
     * <br>
     * <p>>  You can set this parameter when an Express Connect circuit is used.</p>
     */
    @NameInMap("HealthCheckSourceIp")
    public String healthCheckSourceIp;

    /**
     * <p>The destination IP address that is used to perform health checks.</p>
     * <br>
     * <p>>  This parameter is required when **HealthCheckSourceIp** is specified.</p>
     */
    @NameInMap("HealthCheckTargetIp")
    public String healthCheckTargetIp;

    /**
     * <p>The name of the router interface.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the peer router interface.</p>
     */
    @NameInMap("OppositeInterfaceId")
    public String oppositeInterfaceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the peer router interface belongs.</p>
     */
    @NameInMap("OppositeInterfaceOwnerId")
    public Long oppositeInterfaceOwnerId;

    /**
     * <p>The ID of the peer router.</p>
     */
    @NameInMap("OppositeRouterId")
    public String oppositeRouterId;

    /**
     * <p>The type of router to which the peer router interface belongs. Valid values:</p>
     * <br>
     * <p>*   **VRouter**</p>
     * <p>*   **VBR** (default)</p>
     */
    @NameInMap("OppositeRouterType")
    public String oppositeRouterType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the router interface.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the router interface.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
