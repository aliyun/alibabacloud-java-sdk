// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppVersionsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public ListAppVersionsQuery query;

    public static ListAppVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppVersionsRequest self = new ListAppVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppVersionsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppVersionsRequest setQuery(ListAppVersionsQuery query) {
        this.query = query;
        return this;
    }
    public ListAppVersionsQuery getQuery() {
        return this.query;
    }

}
