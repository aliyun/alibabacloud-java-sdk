// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentTracingJudgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryIncidentTracingJudgeResponseBody body;

    public static QueryIncidentTracingJudgeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentTracingJudgeResponse self = new QueryIncidentTracingJudgeResponse();
        return TeaModel.build(map, self);
    }

    public QueryIncidentTracingJudgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIncidentTracingJudgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIncidentTracingJudgeResponse setBody(QueryIncidentTracingJudgeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIncidentTracingJudgeResponseBody getBody() {
        return this.body;
    }

}
