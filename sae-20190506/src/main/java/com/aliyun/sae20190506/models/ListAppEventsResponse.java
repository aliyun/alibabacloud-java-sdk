// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppEventsResponseBody body;

    public static ListAppEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppEventsResponse self = new ListAppEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppEventsResponse setBody(ListAppEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppEventsResponseBody getBody() {
        return this.body;
    }

}
