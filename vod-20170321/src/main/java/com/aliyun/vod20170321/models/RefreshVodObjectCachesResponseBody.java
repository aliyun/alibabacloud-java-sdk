// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshVodObjectCachesResponseBody extends TeaModel {
    /**
     * <p>The ID of the refresh task. Multiple IDs are separated by commas (,). Refresh tasks are merged based on the following rules:</p>
     * <p>If the tasks are set for the same accelerated domain name, submitted within the same second, and refresh content based on URLs instead of directories, the tasks IDs are merged into the same task ID (RefreshTaskId). If the number of these tasks exceeds 2,000, every 2,000 tasks IDs are merged into the same task ID (RefreshTaskId).</p>
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
