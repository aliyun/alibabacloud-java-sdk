// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFederationNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLDCFederationNamespaceResponseBody body;

    public static UpdateLDCFederationNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFederationNamespaceResponse self = new UpdateLDCFederationNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFederationNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLDCFederationNamespaceResponse setBody(UpdateLDCFederationNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLDCFederationNamespaceResponseBody getBody() {
        return this.body;
    }

}
