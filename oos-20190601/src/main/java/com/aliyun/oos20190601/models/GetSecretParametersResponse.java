// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetSecretParametersResponse setBody(GetSecretParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecretParametersResponseBody getBody() {
        return this.body;
    }

}
