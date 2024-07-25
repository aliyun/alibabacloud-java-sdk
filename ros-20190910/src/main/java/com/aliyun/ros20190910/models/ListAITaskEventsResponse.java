// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListAITaskEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAITaskEventsResponseBody body;

    public static ListAITaskEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAITaskEventsResponse self = new ListAITaskEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListAITaskEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAITaskEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAITaskEventsResponse setBody(ListAITaskEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAITaskEventsResponseBody getBody() {
        return this.body;
    }

}
