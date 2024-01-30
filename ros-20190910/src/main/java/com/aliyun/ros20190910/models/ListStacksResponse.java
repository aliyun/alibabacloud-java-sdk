// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStacksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStacksResponseBody body;

    public static ListStacksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStacksResponse self = new ListStacksResponse();
        return TeaModel.build(map, self);
    }

    public ListStacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStacksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStacksResponse setBody(ListStacksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStacksResponseBody getBody() {
        return this.body;
    }

}
