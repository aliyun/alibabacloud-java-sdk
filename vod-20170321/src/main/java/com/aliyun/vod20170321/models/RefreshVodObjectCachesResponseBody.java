// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshVodObjectCachesResponseBody extends TeaModel {
    /**
     * <p>The ID of the purge task. Multiple task IDs are separated by commas (,).
     * The returned purge task IDs are merged based on the following rules:</p>
     * <p>Purge tasks (at URL granularity) submitted for the same domain name within the same second are merged into a single RefreshTaskId.
     * If purge tasks (at URL granularity) submitted for the same domain name within the same second exceed 2,000, they are merged into one RefreshTaskId per 2,000 tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>70422*****2904</p>
     */
    @NameInMap("RefreshTaskId")
    public String refreshTaskId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D61E4801-EAFF-4A63-****-FBF6CE1CFD1C</p>
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
