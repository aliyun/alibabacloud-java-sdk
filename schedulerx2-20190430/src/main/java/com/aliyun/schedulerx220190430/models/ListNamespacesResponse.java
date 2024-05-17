// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ListNamespacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNamespacesResponseBody body;

    public static ListNamespacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacesResponse self = new ListNamespacesResponse();
        return TeaModel.build(map, self);
    }

    public ListNamespacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNamespacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNamespacesResponse setBody(ListNamespacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNamespacesResponseBody getBody() {
        return this.body;
    }

}
