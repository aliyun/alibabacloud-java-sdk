// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMigrationRequest extends TeaModel {
    /**
     * <p>The endpoints to be switched. The endpoints are in the JSON format.</p>
     * <br>
     * <p>> This parameter is valid when the SwapConnectionString parameter is set to true.</p>
     */
    @NameInMap("ConnectionStrings")
    public String connectionStrings;

    /**
     * <p>The ID of cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the new instance or new cluster. Valid values:</p>
     * <br>
     * <p>*   To perform a data migration, enter the ID of the PolarDB cluster.</p>
     * <p>*   To perform a migration rollback, enter the ID of the ApsaraDB for RDS instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NewMasterInstanceId")
    public String newMasterInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the source ApsaraDB RDS instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceRDSDBInstanceId")
    public String sourceRDSDBInstanceId;

    /**
     * <p>Specifies whether to switch the endpoints. Valid values:</p>
     * <br>
     * <p>*   **true**: switches the endpoints. If you select this option, you do not need the change the endpoint in your applications.</p>
     * <p>*   **false**: does not switch the endpoints. If you select this option, you must specify the endpoint of the PolarDB cluster in your applications.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("SwapConnectionString")
    public String swapConnectionString;

    public static ModifyDBClusterMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMigrationRequest self = new ModifyDBClusterMigrationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterMigrationRequest setConnectionStrings(String connectionStrings) {
        this.connectionStrings = connectionStrings;
        return this;
    }
    public String getConnectionStrings() {
        return this.connectionStrings;
    }

    public ModifyDBClusterMigrationRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterMigrationRequest setNewMasterInstanceId(String newMasterInstanceId) {
        this.newMasterInstanceId = newMasterInstanceId;
        return this;
    }
    public String getNewMasterInstanceId() {
        return this.newMasterInstanceId;
    }

    public ModifyDBClusterMigrationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterMigrationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterMigrationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterMigrationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBClusterMigrationRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyDBClusterMigrationRequest setSourceRDSDBInstanceId(String sourceRDSDBInstanceId) {
        this.sourceRDSDBInstanceId = sourceRDSDBInstanceId;
        return this;
    }
    public String getSourceRDSDBInstanceId() {
        return this.sourceRDSDBInstanceId;
    }

    public ModifyDBClusterMigrationRequest setSwapConnectionString(String swapConnectionString) {
        this.swapConnectionString = swapConnectionString;
        return this;
    }
    public String getSwapConnectionString() {
        return this.swapConnectionString;
    }

}
