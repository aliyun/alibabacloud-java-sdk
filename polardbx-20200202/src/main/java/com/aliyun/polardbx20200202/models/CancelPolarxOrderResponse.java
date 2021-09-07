// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CancelPolarxOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelPolarxOrderResponseBody body;

    public static CancelPolarxOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelPolarxOrderResponse self = new CancelPolarxOrderResponse();
        return TeaModel.build(map, self);
    }

    public CancelPolarxOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelPolarxOrderResponse setBody(CancelPolarxOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelPolarxOrderResponseBody getBody() {
        return this.body;
    }

}
