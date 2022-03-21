// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class UntagResourceAllTagsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UntagResourceAllTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagResourceAllTagsResponseBody self = new UntagResourceAllTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagResourceAllTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
