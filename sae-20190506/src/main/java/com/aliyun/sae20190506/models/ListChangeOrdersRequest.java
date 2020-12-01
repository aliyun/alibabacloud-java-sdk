// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListChangeOrdersRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public ListChangeOrdersQuery query;

    public static ListChangeOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChangeOrdersRequest self = new ListChangeOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListChangeOrdersRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChangeOrdersRequest setQuery(ListChangeOrdersQuery query) {
        this.query = query;
        return this;
    }
    public ListChangeOrdersQuery getQuery() {
        return this.query;
    }

}
