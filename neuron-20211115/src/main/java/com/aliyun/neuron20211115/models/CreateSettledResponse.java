// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateSettledResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Settled body;

    public static CreateSettledResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSettledResponse self = new CreateSettledResponse();
        return TeaModel.build(map, self);
    }

    public CreateSettledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSettledResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSettledResponse setBody(Settled body) {
        this.body = body;
        return this;
    }
    public Settled getBody() {
        return this.body;
    }

}
