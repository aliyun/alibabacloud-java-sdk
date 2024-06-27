// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryAuditLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAuditLogResponseBody body;

    public static QueryAuditLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuditLogResponse self = new QueryAuditLogResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuditLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAuditLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAuditLogResponse setBody(QueryAuditLogResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAuditLogResponseBody getBody() {
        return this.body;
    }

}
