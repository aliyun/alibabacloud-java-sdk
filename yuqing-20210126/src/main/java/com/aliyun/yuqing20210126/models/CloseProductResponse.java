// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class CloseProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseProductResponseBody body;

    public static CloseProductResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseProductResponse self = new CloseProductResponse();
        return TeaModel.build(map, self);
    }

    public CloseProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseProductResponse setBody(CloseProductResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseProductResponseBody getBody() {
        return this.body;
    }

}
