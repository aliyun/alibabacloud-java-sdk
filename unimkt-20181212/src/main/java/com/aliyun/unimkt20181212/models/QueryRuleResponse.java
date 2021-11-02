// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRuleResponseBody body;

    public static QueryRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRuleResponse self = new QueryRuleResponse();
        return TeaModel.build(map, self);
    }

    public QueryRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRuleResponse setBody(QueryRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRuleResponseBody getBody() {
        return this.body;
    }

}
