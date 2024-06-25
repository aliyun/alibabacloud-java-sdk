// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhitelistRequest extends TeaModel {
    /**
     * <p>The attributes of the IP whitelist group. Set this parameter to <strong>hidden</strong> to hide the IP whitelist group in the console.</p>
     * <blockquote>
     * <ul>
     * <li>The IP whitelist group that has appeared in the console cannot be hidden.</li>
     * <li>This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>IP</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hidden</p>
     */
    @NameInMap("DBClusterIPArrayAttribute")
    public String DBClusterIPArrayAttribute;

    /**
     * <p>The name of the IP whitelist group. The group name must be 2 to 120 characters in length and consists of lowercase letters and digits. It must start with a letter, and end with a letter or a digit.</p>
     * <ul>
     * <li>If the specified whitelist group name does not exist, the whitelist group is created.</li>
     * <li>If the specified whitelist group name exists, the whitelist group is modified.</li>
     * <li>If you do not specify this parameter, the default group is modified.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can create a maximum of 50 IP whitelist groups for a cluster.</p>
     * </li>
     * <li><p>This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>IP</strong>.</p>
     * </li>
     * </ul>
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
     * <p>The method used to modify the IP whitelist. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong> (default): overwrites the original IP whitelist.</li>
     * <li><strong>Append</strong>: appends IP addresses to the original whitelist.</li>
     * <li><strong>Delete</strong>: deletes IP addresses.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>IP</strong>.</p>
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
     * <p>The ID of the security group. Separate multiple security groups with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li>You can add a maximum of three security groups to a cluster.</li>
     * <li>This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>SecurityGroup</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-*********</p>
     */
    @NameInMap("SecurityGroupIds")
    public String securityGroupIds;

    /**
     * <p>The IP addresses or Classless Inter-Domain Routing (CIDR) blocks in the IP whitelist group. You can add 1,000 IP addresses or CIDR blocks to all the IP whitelist groups. Separate multiple IP addresses with commas (,). The following two formats are supported:</p>
     * <ul>
     * <li>IP addresses. Example: 10.23.12.24.</li>
     * <li>CIDR blocks. Example: 10.23.12.24/24. 24 indicates the length of the prefix of the CIDR block. The length is the range of 1 to 32.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>IP</strong>.</p>
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
     * <li><strong>IP</strong>: IP whitelist group.</li>
     * <li><strong>SecurityGroup</strong>: security group.</li>
     * </ul>
     * <p>Default value: <strong>IP</strong>.</p>
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
