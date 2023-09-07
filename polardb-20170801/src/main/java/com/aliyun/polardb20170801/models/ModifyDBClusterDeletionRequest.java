// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterDeletionRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>>  You can call the [DescribeDBClusters](~~98094~~) operation to.obtain the cluster ID.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to enable the cluster lock feature. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: enables the cluster lock feature. If you enable the cluster lock feature, you cannot directly release the cluster. You must disable the cluster lock feature before you can release the cluster.</p>
     * <p>*   **false**: disables the cluster lock feature.</p>
     */
    @NameInMap("Protection")
    public Boolean protection;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBClusterDeletionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterDeletionRequest self = new ModifyDBClusterDeletionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterDeletionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterDeletionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterDeletionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterDeletionRequest setProtection(Boolean protection) {
        this.protection = protection;
        return this;
    }
    public Boolean getProtection() {
        return this.protection;
    }

    public ModifyDBClusterDeletionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterDeletionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
