// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParameterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetSecretParameterResponse setBody(GetSecretParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecretParameterResponseBody getBody() {
        return this.body;
    }

}
