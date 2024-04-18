// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTaskExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskExecutionsResponseBody body;

    public static ListTaskExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskExecutionsResponse self = new ListTaskExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskExecutionsResponse setBody(ListTaskExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskExecutionsResponseBody getBody() {
        return this.body;
    }

}
