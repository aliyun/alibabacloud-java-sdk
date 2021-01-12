// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseBetweenInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static CopyDatabaseBetweenInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyDatabaseBetweenInstancesResponseBody self = new CopyDatabaseBetweenInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyDatabaseBetweenInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopyDatabaseBetweenInstancesResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
