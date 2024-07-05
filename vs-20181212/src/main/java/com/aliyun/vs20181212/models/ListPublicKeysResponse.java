// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListPublicKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublicKeysResponseBody body;

    public static ListPublicKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublicKeysResponse self = new ListPublicKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListPublicKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublicKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublicKeysResponse setBody(ListPublicKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicKeysResponseBody getBody() {
        return this.body;
    }

}
