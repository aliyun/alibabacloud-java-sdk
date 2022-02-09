// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ValidateOmsEndpointConnectionByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateOmsEndpointConnectionByIdResponseBody body;

    public static ValidateOmsEndpointConnectionByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateOmsEndpointConnectionByIdResponse self = new ValidateOmsEndpointConnectionByIdResponse();
        return TeaModel.build(map, self);
    }

    public ValidateOmsEndpointConnectionByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateOmsEndpointConnectionByIdResponse setBody(ValidateOmsEndpointConnectionByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateOmsEndpointConnectionByIdResponseBody getBody() {
        return this.body;
    }

}
