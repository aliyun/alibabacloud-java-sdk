// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DecreaseNodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DecreaseNodeGroupResponseBody body;

    public static DecreaseNodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DecreaseNodeGroupResponse self = new DecreaseNodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public DecreaseNodeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DecreaseNodeGroupResponse setBody(DecreaseNodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DecreaseNodeGroupResponseBody getBody() {
        return this.body;
    }

}
