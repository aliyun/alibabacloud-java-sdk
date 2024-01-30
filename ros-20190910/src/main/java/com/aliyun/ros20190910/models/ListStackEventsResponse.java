// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStackEventsResponseBody body;

    public static ListStackEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackEventsResponse self = new ListStackEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListStackEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStackEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStackEventsResponse setBody(ListStackEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStackEventsResponseBody getBody() {
        return this.body;
    }

}
