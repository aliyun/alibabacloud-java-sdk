// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RefreshDBClusterStorageUsageResponseBody extends TeaModel {
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
