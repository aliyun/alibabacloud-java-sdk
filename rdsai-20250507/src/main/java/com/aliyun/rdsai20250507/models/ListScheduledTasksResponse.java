// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListScheduledTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScheduledTasksResponseBody body;

    public static ListScheduledTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledTasksResponse self = new ListScheduledTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListScheduledTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScheduledTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScheduledTasksResponse setBody(ListScheduledTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScheduledTasksResponseBody getBody() {
        return this.body;
    }

}
