// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySmartAccessGatewayRequest extends TeaModel {
    /**
     * <p>The CIDR blocks of terminals in the private network. Make sure that the CIDR blocks do not overlap with each other.</p>
     * <p>If the LAN ports of the terminals use dynamic routing, the IP addresses within the first private CIDR block are allocated to the terminals that have Dynamic Host Configuration Protocol (DHCP) enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.0/24</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The description of the SAG instance.</p>
     * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to audit the network connection logs of the SAS app instance.</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSoftwareConnectionAudit")
    public Boolean enableSoftwareConnectionAudit;

    /**
     * <p>The name of the SAG instance.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>SAG</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The location where the SAG instance is deployed.</p>
     */
    @NameInMap("Position")
    public String position;

    /**
     * <p>The ID of the region where the SAG instance is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The policy that is used to advertise routes to Alibaba Cloud. Valid values:</p>
     * <ul>
     * <li><strong>static</strong>: static routing</li>
     * <li><strong>dynamic</strong>: dynamic routing</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("RoutingStrategy")
    public String routingStrategy;

    /**
     * <p>The time during which the disconnected SAG instance remains locked. Valid values: an integer that is greater than or equal to 0.</p>
     * <p>Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SecurityLockThreshold")
    public Integer securityLockThreshold;

    /**
     * <p>The ID of the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-0ovhf732a9j0******</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    public static ModifySmartAccessGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySmartAccessGatewayRequest self = new ModifySmartAccessGatewayRequest();
        return TeaModel.build(map, self);
    }

    public ModifySmartAccessGatewayRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public ModifySmartAccessGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifySmartAccessGatewayRequest setEnableSoftwareConnectionAudit(Boolean enableSoftwareConnectionAudit) {
        this.enableSoftwareConnectionAudit = enableSoftwareConnectionAudit;
        return this;
    }
    public Boolean getEnableSoftwareConnectionAudit() {
        return this.enableSoftwareConnectionAudit;
    }

    public ModifySmartAccessGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifySmartAccessGatewayRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySmartAccessGatewayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySmartAccessGatewayRequest setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public ModifySmartAccessGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySmartAccessGatewayRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySmartAccessGatewayRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySmartAccessGatewayRequest setRoutingStrategy(String routingStrategy) {
        this.routingStrategy = routingStrategy;
        return this;
    }
    public String getRoutingStrategy() {
        return this.routingStrategy;
    }

    public ModifySmartAccessGatewayRequest setSecurityLockThreshold(Integer securityLockThreshold) {
        this.securityLockThreshold = securityLockThreshold;
        return this;
    }
    public Integer getSecurityLockThreshold() {
        return this.securityLockThreshold;
    }

    public ModifySmartAccessGatewayRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

}
