// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAccountLockStateRequest extends TeaModel {
    /**
     * <p>The lock status of the account. Valid values:</p>
     * <ul>
     * <li><p><strong>UnLock</strong>: The account is not locked.</p>
     * </li>
     * <li><p><strong>Lock</strong>: The account is locked.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Lock</p>
     */
    @NameInMap("AccountLockState")
    public String accountLockState;

    /**
     * <p>The name of the database account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>your_account_name</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The expiration time of the account. The time must be in the \<code>YYYY-MM-DDThh:mm:ssZ\\</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-17T10:00:00Z</p>
     */
    @NameInMap("AccountPasswordValidTime")
    public String accountPasswordValidTime;

    /**
     * <p>The ID of the cluster.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to view the details of all clusters in a region, including cluster IDs.</p>
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
