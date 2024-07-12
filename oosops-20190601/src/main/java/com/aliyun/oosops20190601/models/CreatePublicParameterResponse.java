// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class CreatePublicParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePublicParameterResponseBody body;

    public static CreatePublicParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePublicParameterResponse self = new CreatePublicParameterResponse();
        return TeaModel.build(map, self);
    }

    public CreatePublicParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePublicParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePublicParameterResponse setBody(CreatePublicParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePublicParameterResponseBody getBody() {
        return this.body;
    }

}
