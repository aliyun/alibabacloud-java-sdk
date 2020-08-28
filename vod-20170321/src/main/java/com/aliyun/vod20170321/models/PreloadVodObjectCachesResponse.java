// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class PreloadVodObjectCachesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PreloadTaskId")
    @Validation(required = true)
    public String preloadTaskId;

    public static PreloadVodObjectCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        PreloadVodObjectCachesResponse self = new PreloadVodObjectCachesResponse();
        return TeaModel.build(map, self);
    }

}
