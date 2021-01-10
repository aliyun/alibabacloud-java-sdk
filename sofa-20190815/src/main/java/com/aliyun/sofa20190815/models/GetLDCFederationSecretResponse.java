// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCFederationSecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLDCFederationSecretResponseBody body;

    public static GetLDCFederationSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLDCFederationSecretResponse self = new GetLDCFederationSecretResponse();
        return TeaModel.build(map, self);
    }

    public GetLDCFederationSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLDCFederationSecretResponse setBody(GetLDCFederationSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLDCFederationSecretResponseBody getBody() {
        return this.body;
    }

}
