// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class PreloadVodObjectCachesResponseBody extends TeaModel {
    /**
     * <p>The ID of the prefetch task. Separate multiple task IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>9524****</p>
     */
    @NameInMap("PreloadTaskId")
    public String preloadTaskId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E5BD4B50-7A02-493A-*****-97B9024B4135</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PreloadVodObjectCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreloadVodObjectCachesResponseBody self = new PreloadVodObjectCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public PreloadVodObjectCachesResponseBody setPreloadTaskId(String preloadTaskId) {
        this.preloadTaskId = preloadTaskId;
        return this;
    }
    public String getPreloadTaskId() {
        return this.preloadTaskId;
    }

    public PreloadVodObjectCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
