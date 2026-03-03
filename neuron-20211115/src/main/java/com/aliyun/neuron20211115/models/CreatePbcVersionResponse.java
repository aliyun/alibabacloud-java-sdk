// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PbcVersion body;

    public static CreatePbcVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcVersionResponse self = new CreatePbcVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreatePbcVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePbcVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePbcVersionResponse setBody(PbcVersion body) {
        this.body = body;
        return this;
    }
    public PbcVersion getBody() {
        return this.body;
    }

}
