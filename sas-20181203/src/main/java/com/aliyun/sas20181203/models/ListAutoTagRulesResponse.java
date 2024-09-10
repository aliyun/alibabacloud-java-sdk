// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAutoTagRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAutoTagRulesResponseBody body;

    public static ListAutoTagRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutoTagRulesResponse self = new ListAutoTagRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAutoTagRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutoTagRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAutoTagRulesResponse setBody(ListAutoTagRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutoTagRulesResponseBody getBody() {
        return this.body;
    }

}
