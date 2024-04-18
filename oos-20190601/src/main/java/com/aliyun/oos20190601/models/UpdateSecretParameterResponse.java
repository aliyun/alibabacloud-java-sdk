// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateSecretParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSecretParameterResponseBody body;

    public static UpdateSecretParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretParameterResponse self = new UpdateSecretParameterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSecretParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSecretParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSecretParameterResponse setBody(UpdateSecretParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSecretParameterResponseBody getBody() {
        return this.body;
    }

}
