// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListTrafficControlTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrafficControlTasksResponseBody body;

    public static ListTrafficControlTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficControlTasksResponse self = new ListTrafficControlTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListTrafficControlTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrafficControlTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrafficControlTasksResponse setBody(ListTrafficControlTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrafficControlTasksResponseBody getBody() {
        return this.body;
    }

}
