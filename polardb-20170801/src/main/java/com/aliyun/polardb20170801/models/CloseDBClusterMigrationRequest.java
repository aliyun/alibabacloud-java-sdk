// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CloseDBClusterMigrationRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("ContinueEnableBinlog")
    public Boolean continueEnableBinlog;

    public static CloseDBClusterMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseDBClusterMigrationRequest self = new CloseDBClusterMigrationRequest();
        return TeaModel.build(map, self);
    }

}
