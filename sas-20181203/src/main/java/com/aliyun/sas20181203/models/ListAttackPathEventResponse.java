// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAttackPathEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAttackPathEventResponseBody body;

    public static ListAttackPathEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAttackPathEventResponse self = new ListAttackPathEventResponse();
        return TeaModel.build(map, self);
    }

    public ListAttackPathEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAttackPathEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAttackPathEventResponse setBody(ListAttackPathEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAttackPathEventResponseBody getBody() {
        return this.body;
    }

}
