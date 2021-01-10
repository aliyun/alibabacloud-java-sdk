// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCFederationNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLDCFederationNamespaceResponseBody body;

    public static ListLDCFederationNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLDCFederationNamespaceResponse self = new ListLDCFederationNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public ListLDCFederationNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLDCFederationNamespaceResponse setBody(ListLDCFederationNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLDCFederationNamespaceResponseBody getBody() {
        return this.body;
    }

}
