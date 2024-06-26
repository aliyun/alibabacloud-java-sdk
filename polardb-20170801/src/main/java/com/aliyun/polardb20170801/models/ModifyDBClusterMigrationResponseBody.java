// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMigrationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B303A5-653F-4AEE-A598-023FF9******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterMigrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMigrationResponseBody self = new ModifyDBClusterMigrationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterMigrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
