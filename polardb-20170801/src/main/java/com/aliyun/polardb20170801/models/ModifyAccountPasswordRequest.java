// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAccountPasswordRequest extends TeaModel {
    /**
     * <p>The username of the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testacc</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The new password of the account. The new password must meet the following requirements:</p>
     * <ul>
     * <li>It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>It must be 8 to 32 characters in length.</li>
     * <li>Special characters include <code>! @ # $ % ^ &amp; * ( ) _ + - =</code></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Pw123456</p>
     */
    @NameInMap("NewAccountPassword")
    public String newAccountPassword;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password type.</p>
     * 
     * <strong>example:</strong>
     * <p>Tair</p>
     */
    @NameInMap("PasswordType")
    public String passwordType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyAccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPasswordRequest self = new ModifyAccountPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPasswordRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyAccountPasswordRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAccountPasswordRequest setNewAccountPassword(String newAccountPassword) {
        this.newAccountPassword = newAccountPassword;
        return this;
    }
    public String getNewAccountPassword() {
        return this.newAccountPassword;
    }

    public ModifyAccountPasswordRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAccountPasswordRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAccountPasswordRequest setPasswordType(String passwordType) {
        this.passwordType = passwordType;
        return this;
    }
    public String getPasswordType() {
        return this.passwordType;
    }

    public ModifyAccountPasswordRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAccountPasswordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
