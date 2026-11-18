// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The modification method. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong> (default): overwrites the original whitelist.</li>
     * <li><strong>Append</strong>: appends IP addresses to the whitelist.</li>
     * <li><strong>Delete</strong>: deletes the whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Append</p>
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
     * <p>The attribute of the IP whitelist group. Default value: empty. This parameter is used to distinguish different attribute values. The console does not display whitelist groups whose attribute value is <strong>hidden</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>hidden</p>
     */
    @NameInMap("SecurityIpGroupAttribute")
    public String securityIpGroupAttribute;

    /**
     * <p>The name of the IP whitelist group. <warning>You cannot modify a system-generated whitelist group. If you do not specify this parameter, the whitelist of the default group is modified by default.</warning></p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("SecurityIpGroupName")
    public String securityIpGroupName;

    /**
     * <p>The list of IP addresses in the IP whitelist group. A maximum of 1,000 IP addresses can be added. Separate multiple IP addresses with commas (,). Valid formats: 0.0.0.0/0, 10.23.12.24, or 10.23.12.24/24 (CIDR format, where /24 specifies the prefix length of the address, ranging from 1 to 32).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100.64.<em><strong>.0/24,10.101.11.</strong></em></p>
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
