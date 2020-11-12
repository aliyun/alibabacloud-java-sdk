// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class ListSavepointsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public ListSavepointsQuery query;

    public static ListSavepointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSavepointsRequest self = new ListSavepointsRequest();
        return TeaModel.build(map, self);
    }

    public ListSavepointsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSavepointsRequest setQuery(ListSavepointsQuery query) {
        this.query = query;
        return this;
    }
    public ListSavepointsQuery getQuery() {
        return this.query;
    }

}
