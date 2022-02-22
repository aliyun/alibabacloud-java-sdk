// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RefreshProxyLevelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshProxyLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshProxyLevelResponseBody self = new RefreshProxyLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshProxyLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
