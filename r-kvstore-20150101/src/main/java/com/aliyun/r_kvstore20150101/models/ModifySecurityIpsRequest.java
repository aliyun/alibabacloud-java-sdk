// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsRequest extends TeaModel {
    /**
     * <p>The ID of the instance whose IP whitelist is modified.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The method of modification. Valid values:</p>
     * <br>
     * <p>*   **Cover**: overwrites the whitelist.</p>
     * <p>*   **Append**: appends data to the whitelist.</p>
     * <p>*   **Delete**: deletes the whitelist.</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Default value: null. The attribute of the whitelist group. The ApsaraDB for Redis console does not display the whitelist group whose value of this parameter is **hidden**.</p>
     */
    @NameInMap("SecurityIpGroupAttribute")
    public String securityIpGroupAttribute;

    /**
     * <p>The name of the IP address whitelist.</p>
     */
    @NameInMap("SecurityIpGroupName")
    public String securityIpGroupName;

    /**
     * <p>The IP addresses in the whitelist group. Up to 1,000 IP addresses can be specified in each whitelist. Separate multiple IP addresses with a comma (,). You can add 0.0.0.0/0, IP addresses such as 10.23.12.24, and Classless Inter-Domain Routing (CIDR) blocks such as 10.23.12.24/24 to the whitelist group. In CIDR block 10.23.12.24/24, /24 specifies the length of the prefix in the IP addresses. The prefix length ranges from 1 to 32.</p>
     */
    @NameInMap("SecurityIps")
    public String securityIps;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifySecurityIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIpsRequest self = new ModifySecurityIpsRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifySecurityIpsRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifySecurityIpsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySecurityIpsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySecurityIpsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySecurityIpsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySecurityIpsRequest setSecurityIpGroupAttribute(String securityIpGroupAttribute) {
        this.securityIpGroupAttribute = securityIpGroupAttribute;
        return this;
    }
    public String getSecurityIpGroupAttribute() {
        return this.securityIpGroupAttribute;
    }

    public ModifySecurityIpsRequest setSecurityIpGroupName(String securityIpGroupName) {
        this.securityIpGroupName = securityIpGroupName;
        return this;
    }
    public String getSecurityIpGroupName() {
        return this.securityIpGroupName;
    }

    public ModifySecurityIpsRequest setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }
    public String getSecurityIps() {
        return this.securityIps;
    }

    public ModifySecurityIpsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
