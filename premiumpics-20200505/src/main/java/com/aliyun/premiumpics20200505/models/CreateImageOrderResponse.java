// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class CreateImageOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateImageOrderResponseBody body;

    public static CreateImageOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageOrderResponse self = new CreateImageOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageOrderResponse setBody(CreateImageOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageOrderResponseBody getBody() {
        return this.body;
    }

}
