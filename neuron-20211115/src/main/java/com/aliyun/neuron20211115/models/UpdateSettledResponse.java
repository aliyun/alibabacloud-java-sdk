// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateSettledResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Settled body;

    public static UpdateSettledResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSettledResponse self = new UpdateSettledResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSettledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSettledResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSettledResponse setBody(Settled body) {
        this.body = body;
        return this;
    }
    public Settled getBody() {
        return this.body;
    }

}
