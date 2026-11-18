// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAccountLockStateRequest extends TeaModel {
    /**
     * <p>The lock status of the account. Valid values:</p>
     * <ul>
     * <li><strong>UnLock</strong>: Unlocked.</li>
     * <li><strong>Lock</strong>: Locked.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Lock</p>
     */
    @NameInMap("AccountLockState")
    public String accountLockState;

    /**
     * <p>The account name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>your_account_name</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The expiration time of the account, in the YYYY-MM-DDThh:mm:ssZ format. The account expires at the specified time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-17T10:00:00Z</p>
     */
    @NameInMap("AccountPasswordValidTime")
    public String accountPasswordValidTime;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to view all clusters in the target region, including their cluster IDs.</p>
     * </blockquote>
     * <blockquote>
     * <p>This operation is supported only for PostgreSQL clusters (DBType=PostgreSQL). Before calling this operation, you can query the DBType and DBClusterStatus by using DescribeDBClusters to confirm that the cluster is in the Running state.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyAccountLockStateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountLockStateRequest self = new ModifyAccountLockStateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountLockStateRequest setAccountLockState(String accountLockState) {
        this.accountLockState = accountLockState;
        return this;
    }
    public String getAccountLockState() {
        return this.accountLockState;
    }

    public ModifyAccountLockStateRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyAccountLockStateRequest setAccountPasswordValidTime(String accountPasswordValidTime) {
        this.accountPasswordValidTime = accountPasswordValidTime;
        return this;
    }
    public String getAccountPasswordValidTime() {
        return this.accountPasswordValidTime;
    }

    public ModifyAccountLockStateRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAccountLockStateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAccountLockStateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAccountLockStateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAccountLockStateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
