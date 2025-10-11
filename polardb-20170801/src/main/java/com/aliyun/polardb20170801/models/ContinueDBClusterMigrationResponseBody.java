// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ContinueDBClusterMigrationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D2056BBE-FF76-5825-AB63-5CB1ABB46218</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ContinueDBClusterMigrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContinueDBClusterMigrationResponseBody self = new ContinueDBClusterMigrationResponseBody();
        return TeaModel.build(map, self);
    }

    public ContinueDBClusterMigrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
