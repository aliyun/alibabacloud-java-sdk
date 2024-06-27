// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class QueryAuthRuleDetailByRuleIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAuthRuleDetailByRuleIdResponseBody body;

    public static QueryAuthRuleDetailByRuleIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthRuleDetailByRuleIdResponse self = new QueryAuthRuleDetailByRuleIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthRuleDetailByRuleIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAuthRuleDetailByRuleIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAuthRuleDetailByRuleIdResponse setBody(QueryAuthRuleDetailByRuleIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAuthRuleDetailByRuleIdResponseBody getBody() {
        return this.body;
    }

}
