// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIpamsResponseBody body;

    public static ListIpamsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpamsResponse self = new ListIpamsResponse();
        return TeaModel.build(map, self);
    }

    public ListIpamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIpamsResponse setBody(ListIpamsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpamsResponseBody getBody() {
        return this.body;
    }

}
