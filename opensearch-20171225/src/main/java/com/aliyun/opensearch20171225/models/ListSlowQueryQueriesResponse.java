// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSlowQueryQueriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSlowQueryQueriesResponseBody body;

    public static ListSlowQueryQueriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSlowQueryQueriesResponse self = new ListSlowQueryQueriesResponse();
        return TeaModel.build(map, self);
    }

    public ListSlowQueryQueriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSlowQueryQueriesResponse setBody(ListSlowQueryQueriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSlowQueryQueriesResponseBody getBody() {
        return this.body;
    }

}
