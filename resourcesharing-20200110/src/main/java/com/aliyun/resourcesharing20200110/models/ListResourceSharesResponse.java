// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceSharesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceSharesResponseBody body;

    public static ListResourceSharesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceSharesResponse self = new ListResourceSharesResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceSharesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceSharesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceSharesResponse setBody(ListResourceSharesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceSharesResponseBody getBody() {
        return this.body;
    }

}
