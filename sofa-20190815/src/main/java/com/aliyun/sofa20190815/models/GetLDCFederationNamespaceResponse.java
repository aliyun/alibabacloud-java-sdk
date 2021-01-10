// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCFederationNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLDCFederationNamespaceResponseBody body;

    public static GetLDCFederationNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLDCFederationNamespaceResponse self = new GetLDCFederationNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public GetLDCFederationNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLDCFederationNamespaceResponse setBody(GetLDCFederationNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLDCFederationNamespaceResponseBody getBody() {
        return this.body;
    }

}
