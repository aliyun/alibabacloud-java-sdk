// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifySQLRateLimitingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySQLRateLimitingRulesResponseBody body;

    public static ModifySQLRateLimitingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySQLRateLimitingRulesResponse self = new ModifySQLRateLimitingRulesResponse();
        return TeaModel.build(map, self);
    }

    public ModifySQLRateLimitingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySQLRateLimitingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySQLRateLimitingRulesResponse setBody(ModifySQLRateLimitingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySQLRateLimitingRulesResponseBody getBody() {
        return this.body;
    }

}
