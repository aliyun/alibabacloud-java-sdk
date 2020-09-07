// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportDatabaseBetweenInstancesRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("SourceDBInstanceId")
    @Validation(required = true)
    public String sourceDBInstanceId;

    @NameInMap("DBInfo")
    @Validation(required = true)
    public String DBInfo;

    public static ImportDatabaseBetweenInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDatabaseBetweenInstancesRequest self = new ImportDatabaseBetweenInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ImportDatabaseBetweenInstancesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ImportDatabaseBetweenInstancesRequest setSourceDBInstanceId(String sourceDBInstanceId) {
        this.sourceDBInstanceId = sourceDBInstanceId;
        return this;
    }
    public String getSourceDBInstanceId() {
        return this.sourceDBInstanceId;
    }

    public ImportDatabaseBetweenInstancesRequest setDBInfo(String DBInfo) {
        this.DBInfo = DBInfo;
        return this;
    }
    public String getDBInfo() {
        return this.DBInfo;
    }

}
