// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterTDERequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to allow the TDE key of the cluster to be automatically rotated within the next maintenance window after a lapse of the rotation period when a change in the KMS key version is detected. This parameter is supported only for custom keys. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter is supported only for a PolarDB for PostgreSQL or PolarDB for PostgreSQL (Compatible with Oracle) cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAutomaticRotation")
    public String enableAutomaticRotation;

    /**
     * <p>Specifies whether to enable automatic encryption for new tables. Valid values:</p>
     * <ul>
     * <li><strong>ON</strong></li>
     * <li><strong>OFF</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only for a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("EncryptNewTables")
    public String encryptNewTables;

    /**
     * <p>The ID of the custom key.</p>
     * 
     * <strong>example:</strong>
     * <p>749c1df7-<strong><strong>-</strong></strong>-<strong><strong>-</strong></strong>*****</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role. A RAM role is a virtual identity that you can create within your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/93689.html">RAM role overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1406926*****:role/aliyunrdsinstanceencryptiondefaultrole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>Modifies the TDE status. Set the value to <strong>Enable</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("TDEStatus")
    public String TDEStatus;

    public static ModifyDBClusterTDERequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterTDERequest self = new ModifyDBClusterTDERequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterTDERequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterTDERequest setEnableAutomaticRotation(String enableAutomaticRotation) {
        this.enableAutomaticRotation = enableAutomaticRotation;
        return this;
    }
    public String getEnableAutomaticRotation() {
        return this.enableAutomaticRotation;
    }

    public ModifyDBClusterTDERequest setEncryptNewTables(String encryptNewTables) {
        this.encryptNewTables = encryptNewTables;
        return this;
    }
    public String getEncryptNewTables() {
        return this.encryptNewTables;
    }

    public ModifyDBClusterTDERequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public ModifyDBClusterTDERequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterTDERequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterTDERequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterTDERequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBClusterTDERequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public ModifyDBClusterTDERequest setTDEStatus(String TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public String getTDEStatus() {
        return this.TDEStatus;
    }

}
