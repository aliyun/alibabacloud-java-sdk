// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserTaskExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserTaskExecutionsResponseBody body;

    public static ListUserTaskExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserTaskExecutionsResponse self = new ListUserTaskExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserTaskExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserTaskExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserTaskExecutionsResponse setBody(ListUserTaskExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserTaskExecutionsResponseBody getBody() {
        return this.body;
    }

}
