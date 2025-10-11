// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableSQLRateLimitingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableSQLRateLimitingRulesResponseBody body;

    public static EnableSQLRateLimitingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSQLRateLimitingRulesResponse self = new EnableSQLRateLimitingRulesResponse();
        return TeaModel.build(map, self);
    }

    public EnableSQLRateLimitingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSQLRateLimitingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSQLRateLimitingRulesResponse setBody(EnableSQLRateLimitingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSQLRateLimitingRulesResponseBody getBody() {
        return this.body;
    }

}
