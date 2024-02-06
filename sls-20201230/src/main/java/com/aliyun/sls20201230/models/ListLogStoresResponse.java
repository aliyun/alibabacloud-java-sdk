// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListLogStoresResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLogStoresResponseBody body;

    public static ListLogStoresResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogStoresResponse self = new ListLogStoresResponse();
        return TeaModel.build(map, self);
    }

    public ListLogStoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogStoresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogStoresResponse setBody(ListLogStoresResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogStoresResponseBody getBody() {
        return this.body;
    }

}
