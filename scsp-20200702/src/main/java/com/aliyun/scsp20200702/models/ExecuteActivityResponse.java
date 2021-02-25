// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class ExecuteActivityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteActivityResponseBody body;

    public static ExecuteActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteActivityResponse self = new ExecuteActivityResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteActivityResponse setBody(ExecuteActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteActivityResponseBody getBody() {
        return this.body;
    }

}
