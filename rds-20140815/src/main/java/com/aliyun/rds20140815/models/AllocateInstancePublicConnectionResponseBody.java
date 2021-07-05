// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AllocateInstancePublicConnectionResponseBody extends TeaModel {
    @NameInMap("DbInstanceName")
    public String dbInstanceName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConnectionString")
    public String connectionString;

    public static AllocateInstancePublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateInstancePublicConnectionResponseBody self = new AllocateInstancePublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateInstancePublicConnectionResponseBody setDbInstanceName(String dbInstanceName) {
        this.dbInstanceName = dbInstanceName;
        return this;
    }
    public String getDbInstanceName() {
        return this.dbInstanceName;
    }

    public AllocateInstancePublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllocateInstancePublicConnectionResponseBody setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

}
