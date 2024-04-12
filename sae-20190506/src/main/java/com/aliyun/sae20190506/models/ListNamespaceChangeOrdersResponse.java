// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespaceChangeOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListNamespaceChangeOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNamespaceChangeOrdersResponse setBody(ListNamespaceChangeOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNamespaceChangeOrdersResponseBody getBody() {
        return this.body;
    }

}
