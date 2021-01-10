// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryDWSOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryDWSOrderResponseBody body;

    public static RetryDWSOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryDWSOrderResponse self = new RetryDWSOrderResponse();
        return TeaModel.build(map, self);
    }

    public RetryDWSOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryDWSOrderResponse setBody(RetryDWSOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryDWSOrderResponseBody getBody() {
        return this.body;
    }

}
