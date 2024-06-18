// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupDatabaseResponseBody extends TeaModel {
    /**
     * <p>The name of the database. Format: &quot;db1,db2&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>db1,db2</p>
     */
    @NameInMap("DatabaseNames")
    public String databaseNames;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>08A3B71B-FE08-4B03-974F-CC7EA6DB1828</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDatabaseResponseBody self = new DescribeBackupDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDatabaseResponseBody setDatabaseNames(String databaseNames) {
        this.databaseNames = databaseNames;
        return this;
    }
    public String getDatabaseNames() {
        return this.databaseNames;
    }

    public DescribeBackupDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
