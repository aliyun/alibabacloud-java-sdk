// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RetryPolarxOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryPolarxOrderResponseBody body;

    public static RetryPolarxOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryPolarxOrderResponse self = new RetryPolarxOrderResponse();
        return TeaModel.build(map, self);
    }

    public RetryPolarxOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryPolarxOrderResponse setBody(RetryPolarxOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryPolarxOrderResponseBody getBody() {
        return this.body;
    }

}
