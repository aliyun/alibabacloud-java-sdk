// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportDatabaseBetweenInstancesRequest extends TeaModel {
    @NameInMap("DBInfo")
    public String DBInfo;

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

    @NameInMap("SourceDBInstanceId")
    public String sourceDBInstanceId;

    public static ImportDatabaseBetweenInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDatabaseBetweenInstancesRequest self = new ImportDatabaseBetweenInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ImportDatabaseBetweenInstancesRequest setDBInfo(String DBInfo) {
        this.DBInfo = DBInfo;
        return this;
    }
    public String getDBInfo() {
        return this.DBInfo;
    }

    public ImportDatabaseBetweenInstancesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ImportDatabaseBetweenInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ImportDatabaseBetweenInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportDatabaseBetweenInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ImportDatabaseBetweenInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ImportDatabaseBetweenInstancesRequest setSourceDBInstanceId(String sourceDBInstanceId) {
        this.sourceDBInstanceId = sourceDBInstanceId;
        return this;
    }
    public String getSourceDBInstanceId() {
        return this.sourceDBInstanceId;
    }

}
