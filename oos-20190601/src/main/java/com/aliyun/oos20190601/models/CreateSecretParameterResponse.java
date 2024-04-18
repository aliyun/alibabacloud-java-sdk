// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateSecretParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSecretParameterResponseBody body;

    public static CreateSecretParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretParameterResponse self = new CreateSecretParameterResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecretParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecretParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecretParameterResponse setBody(CreateSecretParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecretParameterResponseBody getBody() {
        return this.body;
    }

}
