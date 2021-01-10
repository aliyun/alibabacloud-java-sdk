// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFederationSecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLDCFederationSecretResponseBody body;

    public static UpdateLDCFederationSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFederationSecretResponse self = new UpdateLDCFederationSecretResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFederationSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLDCFederationSecretResponse setBody(UpdateLDCFederationSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLDCFederationSecretResponseBody getBody() {
        return this.body;
    }

}
