// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryAKSOpsTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryAKSOpsTaskResponseBody body;

    public static RetryAKSOpsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryAKSOpsTaskResponse self = new RetryAKSOpsTaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryAKSOpsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryAKSOpsTaskResponse setBody(RetryAKSOpsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryAKSOpsTaskResponseBody getBody() {
        return this.body;
    }

}
