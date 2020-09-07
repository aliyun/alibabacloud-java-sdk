// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupDatabaseResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DatabaseNames")
    @Validation(required = true)
    public String databaseNames;

    public static DescribeBackupDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDatabaseResponse self = new DescribeBackupDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDatabaseResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupDatabaseResponse setDatabaseNames(String databaseNames) {
        this.databaseNames = databaseNames;
        return this;
    }
    public String getDatabaseNames() {
        return this.databaseNames;
    }

}
