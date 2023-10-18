// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshVodObjectCachesResponseBody extends TeaModel {
    /**
     * <p>The ID of the refresh task. Separate multiple task IDs with commas (,).</p>
     */
    @NameInMap("RefreshTaskId")
    public String refreshTaskId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshVodObjectCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshVodObjectCachesResponseBody self = new RefreshVodObjectCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshVodObjectCachesResponseBody setRefreshTaskId(String refreshTaskId) {
        this.refreshTaskId = refreshTaskId;
        return this;
    }
    public String getRefreshTaskId() {
        return this.refreshTaskId;
    }

    public RefreshVodObjectCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
