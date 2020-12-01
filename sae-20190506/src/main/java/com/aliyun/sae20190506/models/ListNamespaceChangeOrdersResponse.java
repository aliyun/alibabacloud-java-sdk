// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespaceChangeOrdersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNamespaceChangeOrdersResponseBody body;

    public static ListNamespaceChangeOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNamespaceChangeOrdersResponse self = new ListNamespaceChangeOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ListNamespaceChangeOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNamespaceChangeOrdersResponse setBody(ListNamespaceChangeOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNamespaceChangeOrdersResponseBody getBody() {
        return this.body;
    }

}
