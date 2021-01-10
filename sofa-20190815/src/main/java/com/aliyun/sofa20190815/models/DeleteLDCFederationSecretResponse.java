// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCFederationSecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLDCFederationSecretResponseBody body;

    public static DeleteLDCFederationSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCFederationSecretResponse self = new DeleteLDCFederationSecretResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLDCFederationSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLDCFederationSecretResponse setBody(DeleteLDCFederationSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLDCFederationSecretResponseBody getBody() {
        return this.body;
    }

}
