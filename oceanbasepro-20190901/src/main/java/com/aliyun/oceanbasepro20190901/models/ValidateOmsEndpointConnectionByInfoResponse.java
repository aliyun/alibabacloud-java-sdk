// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ValidateOmsEndpointConnectionByInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateOmsEndpointConnectionByInfoResponseBody body;

    public static ValidateOmsEndpointConnectionByInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateOmsEndpointConnectionByInfoResponse self = new ValidateOmsEndpointConnectionByInfoResponse();
        return TeaModel.build(map, self);
    }

    public ValidateOmsEndpointConnectionByInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateOmsEndpointConnectionByInfoResponse setBody(ValidateOmsEndpointConnectionByInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateOmsEndpointConnectionByInfoResponseBody getBody() {
        return this.body;
    }

}
