// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class TagVodResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TagVodResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagVodResourcesResponseBody self = new TagVodResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public TagVodResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
