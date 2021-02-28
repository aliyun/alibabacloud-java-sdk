// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class PreloadScdnObjectCachesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PreloadTaskId")
    public String preloadTaskId;

    public static PreloadScdnObjectCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreloadScdnObjectCachesResponseBody self = new PreloadScdnObjectCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public PreloadScdnObjectCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreloadScdnObjectCachesResponseBody setPreloadTaskId(String preloadTaskId) {
        this.preloadTaskId = preloadTaskId;
        return this;
    }
    public String getPreloadTaskId() {
        return this.preloadTaskId;
    }

}
