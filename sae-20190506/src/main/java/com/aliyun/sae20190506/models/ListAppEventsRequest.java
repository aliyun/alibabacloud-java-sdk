// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppEventsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public ListAppEventsQuery query;

    public static ListAppEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppEventsRequest self = new ListAppEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppEventsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppEventsRequest setQuery(ListAppEventsQuery query) {
        this.query = query;
        return this;
    }
    public ListAppEventsQuery getQuery() {
        return this.query;
    }

}
