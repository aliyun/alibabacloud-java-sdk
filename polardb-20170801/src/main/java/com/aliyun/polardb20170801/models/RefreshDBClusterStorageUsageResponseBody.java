// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RefreshDBClusterStorageUsageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E56531A4-E552-40BA-9C58-137B80******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshDBClusterStorageUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshDBClusterStorageUsageResponseBody self = new RefreshDBClusterStorageUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshDBClusterStorageUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
