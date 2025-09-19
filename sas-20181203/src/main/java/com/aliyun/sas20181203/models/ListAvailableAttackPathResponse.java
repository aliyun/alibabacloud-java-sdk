// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAvailableAttackPathResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAvailableAttackPathResponseBody body;

    public static ListAvailableAttackPathResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableAttackPathResponse self = new ListAvailableAttackPathResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableAttackPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableAttackPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvailableAttackPathResponse setBody(ListAvailableAttackPathResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableAttackPathResponseBody getBody() {
        return this.body;
    }

}
