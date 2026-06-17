// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMigrationRequest extends TeaModel {
    /**
     * <p>The specific endpoints to be switched. The value is a JSON string that specifies the endpoints to be swapped.</p>
     * <blockquote>
     * <p>This parameter is valid only when SwapConnectionString is set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;rm-2ze73el581cs*****.mysql.pre.rds.aliyuncs.com&quot;:&quot;pc-2ze8200s298e*****.mysql.polardb.pre.rds.aliyuncs.com&quot;,&quot;rm-2ze73el581cs86*****.mysql.pre.rds.aliyuncs.com&quot;:&quot;test-p*****.mysql.polardb.pre.rds.aliyuncs.com&quot;}</p>
     */
    @NameInMap("ConnectionStrings")
    public String connectionStrings;

    /**
     * <p>The ID of the PolarDB cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the new instance or cluster. Valid values:</p>
     * <ul>
     * <li><p>Before the switch, enter the PolarDB cluster ID to perform a switch.</p>
     * </li>
     * <li><p>After the switch, enter the RDS instance ID to perform a rollback.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
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
     * <p>The ID of the source RDS instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-************</p>
     */
    @NameInMap("SourceRDSDBInstanceId")
    public String sourceRDSDBInstanceId;

    /**
     * <p>Specifies whether to switch the endpoint. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Switches the endpoint. The application can connect to the database without changing its connection configuration.</p>
     * </li>
     * <li><p><strong>false</strong>: Does not switch the endpoint. The application must be changed to use the new PolarDB endpoint.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
