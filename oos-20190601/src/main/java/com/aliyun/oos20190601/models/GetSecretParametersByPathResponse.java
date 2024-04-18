// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParametersByPathResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecretParametersByPathResponseBody body;

    public static GetSecretParametersByPathResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecretParametersByPathResponse self = new GetSecretParametersByPathResponse();
        return TeaModel.build(map, self);
    }

    public GetSecretParametersByPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecretParametersByPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecretParametersByPathResponse setBody(GetSecretParametersByPathResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecretParametersByPathResponseBody getBody() {
        return this.body;
    }

}
