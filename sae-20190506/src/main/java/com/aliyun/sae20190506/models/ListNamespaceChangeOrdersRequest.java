// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespaceChangeOrdersRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public ListNamespaceChangeOrdersQuery query;

    public static ListNamespaceChangeOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNamespaceChangeOrdersRequest self = new ListNamespaceChangeOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListNamespaceChangeOrdersRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNamespaceChangeOrdersRequest setQuery(ListNamespaceChangeOrdersQuery query) {
        this.query = query;
        return this;
    }
    public ListNamespaceChangeOrdersQuery getQuery() {
        return this.query;
    }

}
