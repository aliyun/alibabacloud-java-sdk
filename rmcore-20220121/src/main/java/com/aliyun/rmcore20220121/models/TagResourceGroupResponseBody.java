// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class TagResourceGroupResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static TagResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagResourceGroupResponseBody self = new TagResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public TagResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
