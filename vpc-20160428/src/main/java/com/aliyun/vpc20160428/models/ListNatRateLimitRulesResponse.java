// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatRateLimitRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNatRateLimitRulesResponseBody body;

    public static ListNatRateLimitRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNatRateLimitRulesResponse self = new ListNatRateLimitRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListNatRateLimitRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNatRateLimitRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNatRateLimitRulesResponse setBody(ListNatRateLimitRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNatRateLimitRulesResponseBody getBody() {
        return this.body;
    }

}
