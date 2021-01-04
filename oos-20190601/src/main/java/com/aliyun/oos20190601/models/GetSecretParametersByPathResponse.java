// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParametersByPathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetSecretParametersByPathResponse setBody(GetSecretParametersByPathResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecretParametersByPathResponseBody getBody() {
        return this.body;
    }

}
