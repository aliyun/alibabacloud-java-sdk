// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAttackEventInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAttackEventInfoResponseBody body;

    public static ListAttackEventInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAttackEventInfoResponse self = new ListAttackEventInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListAttackEventInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAttackEventInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAttackEventInfoResponse setBody(ListAttackEventInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAttackEventInfoResponseBody getBody() {
        return this.body;
    }

}
