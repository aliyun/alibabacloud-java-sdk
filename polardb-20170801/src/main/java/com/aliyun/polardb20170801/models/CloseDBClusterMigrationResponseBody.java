// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CloseDBClusterMigrationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CloseDBClusterMigrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseDBClusterMigrationResponseBody self = new CloseDBClusterMigrationResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseDBClusterMigrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
