// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypeVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceTypeVersionsResponseBody body;

    public static ListResourceTypeVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypeVersionsResponse self = new ListResourceTypeVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceTypeVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceTypeVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceTypeVersionsResponse setBody(ListResourceTypeVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceTypeVersionsResponseBody getBody() {
        return this.body;
    }

}
