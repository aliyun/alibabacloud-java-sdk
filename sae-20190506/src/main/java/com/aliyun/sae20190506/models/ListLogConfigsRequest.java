// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListLogConfigsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public ListLogConfigsQuery query;

    public static ListLogConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogConfigsRequest self = new ListLogConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListLogConfigsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogConfigsRequest setQuery(ListLogConfigsQuery query) {
        this.query = query;
        return this;
    }
    public ListLogConfigsQuery getQuery() {
        return this.query;
    }

}
