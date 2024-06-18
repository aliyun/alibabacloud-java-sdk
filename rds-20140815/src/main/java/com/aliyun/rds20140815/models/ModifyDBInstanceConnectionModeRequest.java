// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionModeRequest extends TeaModel {
    /**
     * <p>The connection mode of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong>: standard mode</li>
     * <li><strong>Safe</strong>: database proxy mode</li>
     * </ul>
     * <p>The system automatically assigns a connection mode to the instance.</p>
     * <blockquote>
     * <p> SQL Server 2012, SQL Server 2016, and SQL Server 2017 support only the standard mode.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Performance</p>
     */
    @NameInMap("ConnectionMode")
    public String connectionMode;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBInstanceConnectionModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionModeRequest self = new ModifyDBInstanceConnectionModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionModeRequest setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
        return this;
    }
    public String getConnectionMode() {
        return this.connectionMode;
    }

    public ModifyDBInstanceConnectionModeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceConnectionModeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceConnectionModeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceConnectionModeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceConnectionModeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
