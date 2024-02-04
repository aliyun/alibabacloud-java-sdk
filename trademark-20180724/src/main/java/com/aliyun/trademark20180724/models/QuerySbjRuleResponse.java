// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QuerySbjRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySbjRuleResponseBody body;

    public static QuerySbjRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySbjRuleResponse self = new QuerySbjRuleResponse();
        return TeaModel.build(map, self);
    }

    public QuerySbjRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySbjRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySbjRuleResponse setBody(QuerySbjRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySbjRuleResponseBody getBody() {
        return this.body;
    }

}
