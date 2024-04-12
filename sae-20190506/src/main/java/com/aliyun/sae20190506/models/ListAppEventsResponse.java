// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListAppEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppEventsResponse setBody(ListAppEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppEventsResponseBody getBody() {
        return this.body;
    }

}
