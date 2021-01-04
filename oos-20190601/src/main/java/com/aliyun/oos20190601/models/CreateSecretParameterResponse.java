// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateSecretParameterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateSecretParameterResponse setBody(CreateSecretParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecretParameterResponseBody getBody() {
        return this.body;
    }

}
