// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Pbc body;

    public static CreatePbcResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcResponse self = new CreatePbcResponse();
        return TeaModel.build(map, self);
    }

    public CreatePbcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePbcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePbcResponse setBody(Pbc body) {
        this.body = body;
        return this;
    }
    public Pbc getBody() {
        return this.body;
    }

}
