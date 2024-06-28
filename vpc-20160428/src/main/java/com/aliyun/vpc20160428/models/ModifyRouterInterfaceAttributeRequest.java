// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete the health check IP addresses configured on the router interface. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteHealthCheckIp")
    public Boolean deleteHealthCheckIp;

    /**
     * <p>The description of the router interface.</p>
     * <p>The value must be 2 to 256 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>The description of the router interface.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The rate of health checks. Unit: milliseconds. The recommended value is <strong>2000</strong>. This value specifies the interval at which probe packets are sent during a health check.</p>
     * <p>In this example, <strong>HcThreshold</strong> is set to <strong>8</strong> and <strong>HcRate</strong> is set to <strong>2000</strong>. In this example, probe packets are sent from <strong>HealthCheckSourceIp</strong> (source address) to <strong>HealthCheckTargetIp</strong> (destination address) every 2,000 seconds. If no response is returned for eight consecutive times, the health check fails.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("HcRate")
    public Integer hcRate;

    /**
     * <p>The healthy threshold. Unit: packets. We recommend that you set the value to <strong>8</strong>. This value specifies the number of probe packets that are sent during a health check.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("HcThreshold")
    public Integer hcThreshold;

    /**
     * <p>The source IP address that is used to perform health checks. The source IP address must be an idle IP address of the local virtual private cloud (VPC).</p>
     * <blockquote>
     * <p> You can set this parameter when an Express Connect circuit is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>116.62.XX.XX</p>
     */
    @NameInMap("HealthCheckSourceIp")
    public String healthCheckSourceIp;

    /**
     * <p>The destination IP address that is used to perform health checks.</p>
     * <blockquote>
     * <p> This parameter is required when <strong>HealthCheckSourceIp</strong> is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>116.62.XX.XX</p>
     */
    @NameInMap("HealthCheckTargetIp")
    public String healthCheckTargetIp;

    /**
     * <p>The name of the router interface.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the peer router interface.</p>
     * 
     * <strong>example:</strong>
     * <p>ri-2zeo3xzyf38r4urz****</p>
     */
    @NameInMap("OppositeInterfaceId")
    public String oppositeInterfaceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the peer router interface belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>28768383240243****</p>
     */
    @NameInMap("OppositeInterfaceOwnerId")
    public Long oppositeInterfaceOwnerId;

    /**
     * <p>The ID of the peer router.</p>
     * 
     * <strong>example:</strong>
     * <p>vrt-bp1jcg5cmxjbl9xgc****</p>
     */
    @NameInMap("OppositeRouterId")
    public String oppositeRouterId;

    /**
     * <p>The type of router to which the peer router interface belongs. Valid values:</p>
     * <ul>
     * <li><strong>VRouter</strong></li>
     * <li><strong>VBR</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VBR</p>
     */
    @NameInMap("OppositeRouterType")
    public String oppositeRouterType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the router interface.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the router interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ri-2zeo3xzyf38r4urz****</p>
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
