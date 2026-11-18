// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GrantAccountPrivilegeZonalRequest extends TeaModel {
    /**
     * <p>The name of the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testacc</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The privileges of the account. Valid values:</p>
     * <ul>
     * <li>ReadWrite: read and write</li>
     * <li>ReadOnly: read-only</li>
     * <li>DMLOnly: DML only</li>
     * <li>DDLOnly: DDL only</li>
     * <li>ReadIndex: read-only and index</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite,ReadOnly</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must ensure that the token is unique among different requests. The token is case-sensitive and up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f5********************</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the PolarDB on ENS cluster. This operation applies only to edge clusters. For standard PolarDB clusters, use GrantAccountPrivilege. You can create an edge cluster by calling CreateDBCluster and setting CloudProvider to ENS and specifying EnsRegionId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the database to which privileges are granted. You can grant privileges to one or more databases at a time. Separate multiple database names with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb_1,testdb_2</p>
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

    public static GrantAccountPrivilegeZonalRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantAccountPrivilegeZonalRequest self = new GrantAccountPrivilegeZonalRequest();
        return TeaModel.build(map, self);
    }

    public GrantAccountPrivilegeZonalRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GrantAccountPrivilegeZonalRequest setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
        return this;
    }
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    public GrantAccountPrivilegeZonalRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GrantAccountPrivilegeZonalRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GrantAccountPrivilegeZonalRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public GrantAccountPrivilegeZonalRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GrantAccountPrivilegeZonalRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GrantAccountPrivilegeZonalRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GrantAccountPrivilegeZonalRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
