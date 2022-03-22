// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class RefreshScdnObjectCachesResponseBody extends TeaModel {
    @NameInMap("RefreshTaskId")
    public String refreshTaskId;

    @NameInMap("RequestId")
    public String requestId;

    public static RefreshScdnObjectCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshScdnObjectCachesResponseBody self = new RefreshScdnObjectCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshScdnObjectCachesResponseBody setRefreshTaskId(String refreshTaskId) {
        this.refreshTaskId = refreshTaskId;
        return this;
    }
    public String getRefreshTaskId() {
        return this.refreshTaskId;
    }

    public RefreshScdnObjectCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
