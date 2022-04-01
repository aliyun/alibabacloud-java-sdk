// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class IncreaseNodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IncreaseNodeGroupResponseBody body;

    public static IncreaseNodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        IncreaseNodeGroupResponse self = new IncreaseNodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public IncreaseNodeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IncreaseNodeGroupResponse setBody(IncreaseNodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public IncreaseNodeGroupResponseBody getBody() {
        return this.body;
    }

}
