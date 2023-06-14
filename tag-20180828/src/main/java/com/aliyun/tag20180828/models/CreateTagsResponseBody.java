// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CreateTagsResponseBody extends TeaModel {
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
