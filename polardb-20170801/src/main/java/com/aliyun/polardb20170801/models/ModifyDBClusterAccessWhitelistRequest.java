// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhitelistRequest extends TeaModel {
    /**
     * <p>The attribute of the IP address whitelist group. If you set this parameter to \<code>hidden\\</code>, the whitelist group is not visible in the console.</p>
     * <blockquote>
     * <ul>
     * <li><p>You cannot hide an IP address whitelist group that is already visible in the console.</p>
     * </li>
     * <li><p>This parameter is available only when <strong>WhiteListType</strong> is set to <strong>IP</strong>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hidden</p>
     */
    @NameInMap("DBClusterIPArrayAttribute")
    public String DBClusterIPArrayAttribute;

    /**
     * <p>The name of the IP address whitelist group. The name must be 2 to 120 characters in length. It must consist of lowercase letters and digits. The name must start with a letter and end with a letter or a digit.</p>
     * <ul>
     * <li><p>If the specified whitelist group name does not exist, a new whitelist group is created.</p>
     * </li>
     * <li><p>If the specified whitelist group name already exists, the whitelist group is modified.</p>
     * </li>
     * <li><p>If you do not specify this parameter, the \<code>default\\</code> group is modified.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>A cluster can have up to 50 IP address whitelist groups.</p>
     * </li>
     * <li><p>This parameter is available only when <strong>WhiteListType</strong> is set to <strong>IP</strong>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DBClusterIPArrayName")
    public String DBClusterIPArrayName;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The method used to modify the IP address whitelist. Valid values:</p>
     * <ul>
     * <li><p><strong>Cover</strong>: Overwrites the original IP address whitelist. This is the default value.</p>
     * </li>
     * <li><p><strong>Append</strong>: Appends IP addresses to the whitelist.</p>
     * </li>
     * <li><p><strong>Delete</strong>: Deletes IP addresses from the whitelist.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only when <strong>WhiteListType</strong> is set to <strong>IP</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
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
     * <p>The security group ID. Separate multiple security group IDs with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li><p>A cluster can be associated with up to three security groups.</p>
     * </li>
     * <li><p>This parameter is available only when <strong>WhiteListType</strong> is set to <strong>SecurityGroup</strong>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-*********</p>
     */
    @NameInMap("SecurityGroupIds")
    public String securityGroupIds;

    /**
     * <p>The IP addresses or CIDR blocks in the IP address whitelist group. All IP address whitelist groups can contain a total of 1,000 IP addresses or CIDR blocks. Separate multiple IP addresses with commas (,). The following formats are supported:</p>
     * <ul>
     * <li><p>IP address format. For example: 10.23.12.24.</p>
     * </li>
     * <li><p>CIDR format. For example: 10.23.12.24/24. The number 24 indicates the prefix length of the IP address. The prefix length can range from 1 to 32.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only when <strong>WhiteListType</strong> is set to <strong>IP</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.23.12.24</p>
     */
    @NameInMap("SecurityIps")
    public String securityIps;

    /**
     * <p>The type of the whitelist. Valid values:</p>
     * <ul>
     * <li><p><strong>IP</strong>: IP address whitelist group.</p>
     * </li>
     * <li><p><strong>SecurityGroup</strong>: Security group.</p>
     * </li>
     * </ul>
     * <p>The default value is <strong>IP</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>IP</p>
     */
    @NameInMap("WhiteListType")
    public String whiteListType;

    public static ModifyDBClusterAccessWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAccessWhitelistRequest self = new ModifyDBClusterAccessWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAccessWhitelistRequest setDBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
        this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
        return this;
    }
    public String getDBClusterIPArrayAttribute() {
        return this.DBClusterIPArrayAttribute;
    }

    public ModifyDBClusterAccessWhitelistRequest setDBClusterIPArrayName(String DBClusterIPArrayName) {
        this.DBClusterIPArrayName = DBClusterIPArrayName;
        return this;
    }
    public String getDBClusterIPArrayName() {
        return this.DBClusterIPArrayName;
    }

    public ModifyDBClusterAccessWhitelistRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterAccessWhitelistRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifyDBClusterAccessWhitelistRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterAccessWhitelistRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterAccessWhitelistRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterAccessWhitelistRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBClusterAccessWhitelistRequest setSecurityGroupIds(String securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public String getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public ModifyDBClusterAccessWhitelistRequest setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }
    public String getSecurityIps() {
        return this.securityIps;
    }

    public ModifyDBClusterAccessWhitelistRequest setWhiteListType(String whiteListType) {
        this.whiteListType = whiteListType;
        return this;
    }
    public String getWhiteListType() {
        return this.whiteListType;
    }

}
