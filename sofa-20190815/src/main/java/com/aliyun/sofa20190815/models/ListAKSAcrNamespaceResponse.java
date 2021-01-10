// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSAcrNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAKSAcrNamespaceResponseBody body;

    public static ListAKSAcrNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAKSAcrNamespaceResponse self = new ListAKSAcrNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public ListAKSAcrNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAKSAcrNamespaceResponse setBody(ListAKSAcrNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAKSAcrNamespaceResponseBody getBody() {
        return this.body;
    }

}
