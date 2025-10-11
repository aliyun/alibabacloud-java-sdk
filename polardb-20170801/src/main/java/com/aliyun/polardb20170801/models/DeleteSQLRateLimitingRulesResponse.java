// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteSQLRateLimitingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSQLRateLimitingRulesResponseBody body;

    public static DeleteSQLRateLimitingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSQLRateLimitingRulesResponse self = new DeleteSQLRateLimitingRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSQLRateLimitingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSQLRateLimitingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSQLRateLimitingRulesResponse setBody(DeleteSQLRateLimitingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSQLRateLimitingRulesResponseBody getBody() {
        return this.body;
    }

}
