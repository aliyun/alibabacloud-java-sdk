// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCFederationNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLDCFederationNamespaceResponseBody body;

    public static DeleteLDCFederationNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCFederationNamespaceResponse self = new DeleteLDCFederationNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLDCFederationNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLDCFederationNamespaceResponse setBody(DeleteLDCFederationNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLDCFederationNamespaceResponseBody getBody() {
        return this.body;
    }

}
