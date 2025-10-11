// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddSQLRateLimitingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSQLRateLimitingRulesResponseBody body;

    public static AddSQLRateLimitingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSQLRateLimitingRulesResponse self = new AddSQLRateLimitingRulesResponse();
        return TeaModel.build(map, self);
    }

    public AddSQLRateLimitingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSQLRateLimitingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSQLRateLimitingRulesResponse setBody(AddSQLRateLimitingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSQLRateLimitingRulesResponseBody getBody() {
        return this.body;
    }

}
