// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListIngressesRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public ListIngressesQuery query;

    public static ListIngressesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIngressesRequest self = new ListIngressesRequest();
        return TeaModel.build(map, self);
    }

    public ListIngressesRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIngressesRequest setQuery(ListIngressesQuery query) {
        this.query = query;
        return this;
    }
    public ListIngressesQuery getQuery() {
        return this.query;
    }

}
