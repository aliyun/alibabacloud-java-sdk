// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAttackPathWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAttackPathWhitelistResponseBody body;

    public static ListAttackPathWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAttackPathWhitelistResponse self = new ListAttackPathWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public ListAttackPathWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAttackPathWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAttackPathWhitelistResponse setBody(ListAttackPathWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAttackPathWhitelistResponseBody getBody() {
        return this.body;
    }

}
