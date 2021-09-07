// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePolarxOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePolarxOrderResponseBody body;

    public static CreatePolarxOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarxOrderResponse self = new CreatePolarxOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolarxOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePolarxOrderResponse setBody(CreatePolarxOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePolarxOrderResponseBody getBody() {
        return this.body;
    }

}
