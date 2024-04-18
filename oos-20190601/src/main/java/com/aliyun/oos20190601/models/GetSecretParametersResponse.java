// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecretParametersResponseBody body;

    public static GetSecretParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecretParametersResponse self = new GetSecretParametersResponse();
        return TeaModel.build(map, self);
    }

    public GetSecretParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecretParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecretParametersResponse setBody(GetSecretParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecretParametersResponseBody getBody() {
        return this.body;
    }

}
