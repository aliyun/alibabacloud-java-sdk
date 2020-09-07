// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeOssDownloadsForSQLServerRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("MigrateTaskId")
    @Validation(required = true)
    public String migrateTaskId;

    public static DescribeOssDownloadsForSQLServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssDownloadsForSQLServerRequest self = new DescribeOssDownloadsForSQLServerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssDownloadsForSQLServerRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeOssDownloadsForSQLServerRequest setMigrateTaskId(String migrateTaskId) {
        this.migrateTaskId = migrateTaskId;
        return this;
    }
    public String getMigrateTaskId() {
        return this.migrateTaskId;
    }

}
