// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StopDWSTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopDWSTaskResponseBody body;

    public static StopDWSTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDWSTaskResponse self = new StopDWSTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopDWSTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDWSTaskResponse setBody(StopDWSTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDWSTaskResponseBody getBody() {
        return this.body;
    }

}
