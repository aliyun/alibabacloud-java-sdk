// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListResourceRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceRulesResponseBody body;

    public static ListResourceRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceRulesResponse self = new ListResourceRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceRulesResponse setBody(ListResourceRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceRulesResponseBody getBody() {
        return this.body;
    }

}
