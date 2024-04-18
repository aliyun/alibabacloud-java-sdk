// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecretParameterResponseBody body;

    public static GetSecretParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecretParameterResponse self = new GetSecretParameterResponse();
        return TeaModel.build(map, self);
    }

    public GetSecretParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecretParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecretParameterResponse setBody(GetSecretParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecretParameterResponseBody getBody() {
        return this.body;
    }

}
