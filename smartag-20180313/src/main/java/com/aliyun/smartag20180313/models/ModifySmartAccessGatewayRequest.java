// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySmartAccessGatewayRequest extends TeaModel {
    /**
     * <p>The private CIDR block used by clients at the on-premises site for communication. Make sure that private CIDR blocks do not conflict with each other. </p>
     * <p>If the LAN port of the Smart Access Gateway device is configured in dynamic mode, the IP addresses used by on-premises clients with DHCP enabled are allocated from the first private CIDR block that you specify.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.0/24</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The description of the Smart Access Gateway instance. </p>
     * <p>The description must be 2 to 256 characters in length, and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SAG description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable connection log auditing for the SAG app. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables connection log auditing for the SAG app.</p>
     * </li>
     * <li><p><strong>false</strong>: disables connection log auditing for the SAG app.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSoftwareConnectionAudit")
    public Boolean enableSoftwareConnectionAudit;

    /**
     * <p>The name of the Smart Access Gateway instance. </p>
     * <p>The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
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
     * <p>The location where the Smart Access Gateway instance is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;adcode&quot;:&quot;&quot;, &quot;label&quot;:&quot;Hangzhou, Zhejiang xx zone xx Road xx number&quot;, &quot;value&quot;:&quot;B0FFGxxxx&quot;, &quot;center&quot;:&quot;120.190xxxx, 30.182xxxx&quot;, &quot;_new&quot;:&quot;true&quot; } ]</p>
     */
    @NameInMap("Position")
    public String position;

    /**
     * <p>The region ID of the Smart Access Gateway instance.</p>
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
     * <p>The route synchronization mode for the on-premises network. Valid values:</p>
     * <ul>
     * <li><p><strong>static</strong>: static routing.</p>
     * </li>
     * <li><p><strong>dynamic</strong>: dynamic routing.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("RoutingStrategy")
    public String routingStrategy;

    /**
     * <p>The threshold configured by the user for the offline lock feature. The value must be greater than or equal to 0.</p>
     * <p>Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SecurityLockThreshold")
    public Integer securityLockThreshold;

    /**
     * <p>The instance ID of the Smart Access Gateway.</p>
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
