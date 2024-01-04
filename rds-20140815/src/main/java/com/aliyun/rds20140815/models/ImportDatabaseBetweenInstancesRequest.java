// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportDatabaseBetweenInstancesRequest extends TeaModel {
    /**
     * <p>The names of the source and destination databases. The value of this parameter is a JSON string.</p>
     * <br>
     * <p>>  If the source instance runs SQL Server, the value of this parameter consists of one or more key-value pairs. In each key-value pair, the key specifies the name of the source database, and the value specifies the name of the destination database. A source database can have a different name from the destination database. For example, `{"DBNames":{"srcdb":"destdb","srcdb2":"destmydb2"}}` indicates that srcdb is migrated to destdb and srcdb2 is migrated to destmydb2. The names of source databases cannot be the same, and the names of destination databases cannot be the same.</p>
     */
    @NameInMap("DBInfo")
    public String DBInfo;

    /**
     * <p>The ID of the instance.</p>
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

    /**
     * <p>The ID of the source instance, which cannot be the same as the ID of the destination instance.</p>
     */
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
