// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryAccountSafetyIncidentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAccountSafetyIncidentResponseBody body;

    public static QueryAccountSafetyIncidentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountSafetyIncidentResponse self = new QueryAccountSafetyIncidentResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountSafetyIncidentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountSafetyIncidentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccountSafetyIncidentResponse setBody(QueryAccountSafetyIncidentResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountSafetyIncidentResponseBody getBody() {
        return this.body;
    }

}
