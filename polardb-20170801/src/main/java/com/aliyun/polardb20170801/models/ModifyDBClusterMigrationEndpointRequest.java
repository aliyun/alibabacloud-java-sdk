// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMigrationEndpointRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1w68hcomx235jaz</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;dtsJobId\&quot;:\&quot;di4w4d9r12m38mb\&quot;,\&quot;endpoint\&quot;:\&quot;src\&quot;,\&quot;endpointInstanceId\&quot;:\&quot;pc-k2j96w169uhu868l8\&quot;}]</p>
     */
    @NameInMap("MigrationConfig")
    public String migrationConfig;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBClusterMigrationEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMigrationEndpointRequest self = new ModifyDBClusterMigrationEndpointRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterMigrationEndpointRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterMigrationEndpointRequest setMigrationConfig(String migrationConfig) {
        this.migrationConfig = migrationConfig;
        return this;
    }
    public String getMigrationConfig() {
        return this.migrationConfig;
    }

    public ModifyDBClusterMigrationEndpointRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterMigrationEndpointRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterMigrationEndpointRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterMigrationEndpointRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
