// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RefreshDBClusterStorageUsageRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable real-time synchronization. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**: T + 1</p>
     */
    @NameInMap("SyncRealTime")
    public Boolean syncRealTime;

    public static RefreshDBClusterStorageUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshDBClusterStorageUsageRequest self = new RefreshDBClusterStorageUsageRequest();
        return TeaModel.build(map, self);
    }

    public RefreshDBClusterStorageUsageRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RefreshDBClusterStorageUsageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RefreshDBClusterStorageUsageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RefreshDBClusterStorageUsageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RefreshDBClusterStorageUsageRequest setSyncRealTime(Boolean syncRealTime) {
        this.syncRealTime = syncRealTime;
        return this;
    }
    public Boolean getSyncRealTime() {
        return this.syncRealTime;
    }

}
