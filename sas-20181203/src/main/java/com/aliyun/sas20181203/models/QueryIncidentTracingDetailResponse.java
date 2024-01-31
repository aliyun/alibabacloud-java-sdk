// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentTracingDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryIncidentTracingDetailResponseBody body;

    public static QueryIncidentTracingDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentTracingDetailResponse self = new QueryIncidentTracingDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryIncidentTracingDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIncidentTracingDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIncidentTracingDetailResponse setBody(QueryIncidentTracingDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIncidentTracingDetailResponseBody getBody() {
        return this.body;
    }

}
