// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListBusinessAccessPointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBusinessAccessPointsResponseBody body;

    public static ListBusinessAccessPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessAccessPointsResponse self = new ListBusinessAccessPointsResponse();
        return TeaModel.build(map, self);
    }

    public ListBusinessAccessPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBusinessAccessPointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBusinessAccessPointsResponse setBody(ListBusinessAccessPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBusinessAccessPointsResponseBody getBody() {
        return this.body;
    }

}
