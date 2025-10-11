// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSQLRateLimitingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLRateLimitingRulesResponseBody body;

    public static DescribeSQLRateLimitingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLRateLimitingRulesResponse self = new DescribeSQLRateLimitingRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLRateLimitingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLRateLimitingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLRateLimitingRulesResponse setBody(DescribeSQLRateLimitingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLRateLimitingRulesResponseBody getBody() {
        return this.body;
    }

}
