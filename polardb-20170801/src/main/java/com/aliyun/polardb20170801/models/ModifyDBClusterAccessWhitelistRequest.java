// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhitelistRequest extends TeaModel {
    /**
     * <p>The attribute of the IP whitelist group. If this parameter is set to <strong>hidden</strong>, the group is not displayed in the console.</p>
     * <blockquote>
     * <ul>
     * <li>IP whitelist groups that are already displayed in the console cannot be hidden.</li>
     * <li>This parameter takes effect only when <strong>WhiteListType</strong> is set to <strong>IP</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hidden</p>
     */
    @NameInMap("DBClusterIPArrayAttribute")
    public String DBClusterIPArrayAttribute;

    /**
     * <p>The name of the IP whitelist group. The name must be 2 to 120 characters in length and can contain lowercase letters and digits. The name must start with a letter and end with a letter or digit.</p>
     * <ul>
     * <li>If the specified whitelist group name does not exist, a new whitelist group is created.</li>
     * <li>If the specified whitelist group name already exists, the whitelist group is modified.</li>
     * <li>If this parameter is not specified, the default group is modified.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>A maximum of 50 IP whitelist groups are supported for a cluster.</li>
     * <li>This parameter takes effect only when <strong>WhiteListType</strong> is set to <strong>IP</strong>.</li>
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
     * <p>The method used to modify the IP whitelist. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong>: overwrites the original IP whitelist (default value).</li>
     * <li><strong>Append</strong>: appends IP addresses to the whitelist.</li>
     * <li><strong>Delete</strong>: removes IP addresses from the whitelist.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>WhiteListType</strong> is set to <strong>IP</strong>.</p>
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

    /**
     * <strong>example:</strong>
     * <p>pfs-xxx</p>
     */
    @NameInMap("PfsInstanceId")
    public String pfsInstanceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The security group IDs. Separate multiple security group IDs with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li>A maximum of 3 security groups are supported for a cluster.</li>
     * <li>This parameter takes effect only when <strong>WhiteListType</strong> is set to <strong>SecurityGroup</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-*********</p>
     */
    @NameInMap("SecurityGroupIds")
    public String securityGroupIds;

    /**
     * <p>The IP addresses or CIDR blocks in the IP whitelist group. A maximum of 1,000 IP addresses or CIDR blocks can be added to all IP whitelist groups. Separate multiple IP addresses with commas (,). The following two formats are supported: </p>
     * <ul>
     * <li>IP address format, such as 10.23.12.24.</li>
     * <li>CIDR format, such as 10.23.12.24/24, where 24 indicates the prefix length of the CIDR block. The prefix length ranges from 1 to 32.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>WhiteListType</strong> is set to <strong>IP</strong>.</p>
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

    public ModifyDBClusterAccessWhitelistRequest setPfsInstanceId(String pfsInstanceId) {
        this.pfsInstanceId = pfsInstanceId;
        return this;
    }
    public String getPfsInstanceId() {
        return this.pfsInstanceId;
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
