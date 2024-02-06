// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListETLsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListETLsResponseBody body;

    public static ListETLsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListETLsResponse self = new ListETLsResponse();
        return TeaModel.build(map, self);
    }

    public ListETLsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListETLsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListETLsResponse setBody(ListETLsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListETLsResponseBody getBody() {
        return this.body;
    }

}
