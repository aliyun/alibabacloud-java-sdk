// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReopenDWSTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReopenDWSTaskResponseBody body;

    public static ReopenDWSTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ReopenDWSTaskResponse self = new ReopenDWSTaskResponse();
        return TeaModel.build(map, self);
    }

    public ReopenDWSTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReopenDWSTaskResponse setBody(ReopenDWSTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ReopenDWSTaskResponseBody getBody() {
        return this.body;
    }

}
