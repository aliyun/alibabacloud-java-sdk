// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMigrationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBClusterMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMigrationResponse self = new ModifyDBClusterMigrationResponse();
        return TeaModel.build(map, self);
    }

}
