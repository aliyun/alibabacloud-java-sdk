// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServiceRateLimitRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsSgServiceRateLimitRulesResponseBody body;

    public static QueryMsSgServiceRateLimitRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServiceRateLimitRulesResponse self = new QueryMsSgServiceRateLimitRulesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServiceRateLimitRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsSgServiceRateLimitRulesResponse setBody(QueryMsSgServiceRateLimitRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsSgServiceRateLimitRulesResponseBody getBody() {
        return this.body;
    }

}
