// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateCrowdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
