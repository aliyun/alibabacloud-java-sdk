// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CreateTagsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>94E16BB6-3FB6-1297-B5B2-ED2250F437CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTagsResponseBody self = new CreateTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
