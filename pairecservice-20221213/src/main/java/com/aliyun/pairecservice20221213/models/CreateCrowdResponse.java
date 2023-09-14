// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateCrowdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCrowdResponseBody body;

    public static CreateCrowdResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCrowdResponse self = new CreateCrowdResponse();
        return TeaModel.build(map, self);
    }

    public CreateCrowdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCrowdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCrowdResponse setBody(CreateCrowdResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCrowdResponseBody getBody() {
        return this.body;
    }

}
