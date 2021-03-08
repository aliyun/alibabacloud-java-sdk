// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshVodObjectCachesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RefreshTaskId")
    public String refreshTaskId;

    public static RefreshVodObjectCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshVodObjectCachesResponseBody self = new RefreshVodObjectCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshVodObjectCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshVodObjectCachesResponseBody setRefreshTaskId(String refreshTaskId) {
        this.refreshTaskId = refreshTaskId;
        return this;
    }
    public String getRefreshTaskId() {
        return this.refreshTaskId;
    }

}
