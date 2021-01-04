// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateSecretParameterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateSecretParameterResponse setBody(UpdateSecretParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSecretParameterResponseBody getBody() {
        return this.body;
    }

}
