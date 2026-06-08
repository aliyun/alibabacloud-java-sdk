// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class QueryAutoShutdownPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAutoShutdownPoliciesResponseBody body;

    public static QueryAutoShutdownPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAutoShutdownPoliciesResponse self = new QueryAutoShutdownPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public QueryAutoShutdownPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAutoShutdownPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAutoShutdownPoliciesResponse setBody(QueryAutoShutdownPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAutoShutdownPoliciesResponseBody getBody() {
        return this.body;
    }

}
