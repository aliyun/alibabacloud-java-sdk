// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CloseDBClusterMigrationRequest extends TeaModel {
    /**
     * <p>Specifies whether to continue to enable binary logging. Valid values:</p>
     * <br>
     * <p>*   **true**: continues to enable binary logging.</p>
     * <p>*   **false**: disables binary logging.</p>
     * <br>
     * <p>Default value: **true**.</p>
     * <br>
     * <p>> If binary logging is disabled, your PolarDB cluster is restarted.</p>
     */
    @NameInMap("ContinueEnableBinlog")
    public Boolean continueEnableBinlog;

    /**
     * <p>The ID of the cluster.</p>
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

    public static CloseDBClusterMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseDBClusterMigrationRequest self = new CloseDBClusterMigrationRequest();
        return TeaModel.build(map, self);
    }

    public CloseDBClusterMigrationRequest setContinueEnableBinlog(Boolean continueEnableBinlog) {
        this.continueEnableBinlog = continueEnableBinlog;
        return this;
    }
    public Boolean getContinueEnableBinlog() {
        return this.continueEnableBinlog;
    }

    public CloseDBClusterMigrationRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CloseDBClusterMigrationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CloseDBClusterMigrationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloseDBClusterMigrationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloseDBClusterMigrationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
