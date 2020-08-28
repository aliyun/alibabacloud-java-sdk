// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CloseDBClusterMigrationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CloseDBClusterMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseDBClusterMigrationResponse self = new CloseDBClusterMigrationResponse();
        return TeaModel.build(map, self);
    }

}
