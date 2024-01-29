// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListHandshakesForResourceDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHandshakesForResourceDirectoryResponseBody body;

    public static ListHandshakesForResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHandshakesForResourceDirectoryResponse self = new ListHandshakesForResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public ListHandshakesForResourceDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHandshakesForResourceDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHandshakesForResourceDirectoryResponse setBody(ListHandshakesForResourceDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHandshakesForResourceDirectoryResponseBody getBody() {
        return this.body;
    }

}
