// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryAnalysisComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAnalysisComponentResponseBody body;

    public static QueryAnalysisComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAnalysisComponentResponse self = new QueryAnalysisComponentResponse();
        return TeaModel.build(map, self);
    }

    public QueryAnalysisComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAnalysisComponentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAnalysisComponentResponse setBody(QueryAnalysisComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAnalysisComponentResponseBody getBody() {
        return this.body;
    }

}
