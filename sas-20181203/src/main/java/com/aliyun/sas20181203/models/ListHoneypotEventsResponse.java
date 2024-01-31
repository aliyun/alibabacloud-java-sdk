// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHoneypotEventsResponseBody body;

    public static ListHoneypotEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotEventsResponse self = new ListHoneypotEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListHoneypotEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHoneypotEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHoneypotEventsResponse setBody(ListHoneypotEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHoneypotEventsResponseBody getBody() {
        return this.body;
    }

}
