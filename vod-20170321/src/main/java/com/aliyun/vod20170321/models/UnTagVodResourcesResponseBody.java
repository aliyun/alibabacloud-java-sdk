// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UnTagVodResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnTagVodResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnTagVodResourcesResponseBody self = new UnTagVodResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UnTagVodResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
