// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyEncryptionDBSecretRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("EncryptionDBStatus")
    public String encryptionDBStatus;

    /**
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
     * <strong>example:</strong>
     * <p>acs:ram::1406926*****:role/aliyunrdsinstanceencryptiondefaultrole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    public static ModifyEncryptionDBSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEncryptionDBSecretRequest self = new ModifyEncryptionDBSecretRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEncryptionDBSecretRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyEncryptionDBSecretRequest setEncryptionDBStatus(String encryptionDBStatus) {
        this.encryptionDBStatus = encryptionDBStatus;
        return this;
    }
    public String getEncryptionDBStatus() {
        return this.encryptionDBStatus;
    }

    public ModifyEncryptionDBSecretRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public ModifyEncryptionDBSecretRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyEncryptionDBSecretRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyEncryptionDBSecretRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyEncryptionDBSecretRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyEncryptionDBSecretRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

}
