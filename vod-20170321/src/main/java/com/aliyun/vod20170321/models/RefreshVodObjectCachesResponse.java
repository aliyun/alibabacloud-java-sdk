// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshVodObjectCachesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RefreshTaskId")
    @Validation(required = true)
    public String refreshTaskId;

    public static RefreshVodObjectCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshVodObjectCachesResponse self = new RefreshVodObjectCachesResponse();
        return TeaModel.build(map, self);
    }

}
