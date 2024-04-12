// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListLogConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLogConfigsResponseBody body;

    public static ListLogConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogConfigsResponse self = new ListLogConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListLogConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogConfigsResponse setBody(ListLogConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogConfigsResponseBody getBody() {
        return this.body;
    }

}
