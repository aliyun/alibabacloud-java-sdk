// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RevokeAccountPrivilegeRequest extends TeaModel {
    /**
     * <p>The name of the account.</p>
     * <br>
     * <p>>  You can specify only a standard account.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The ID of the PolarDB cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The names of the databases. If you need to specify multiple database names, separate the names with commas (,).</p>
     */
    @NameInMap("DBName")
    public String DBName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RevokeAccountPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeAccountPrivilegeRequest self = new RevokeAccountPrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public RevokeAccountPrivilegeRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public RevokeAccountPrivilegeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public RevokeAccountPrivilegeRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public RevokeAccountPrivilegeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RevokeAccountPrivilegeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RevokeAccountPrivilegeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RevokeAccountPrivilegeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
