// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSqlAuditSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPSqlAuditSummaryResponseBody body;

    public static QueryODPSqlAuditSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSqlAuditSummaryResponse self = new QueryODPSqlAuditSummaryResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPSqlAuditSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPSqlAuditSummaryResponse setBody(QueryODPSqlAuditSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPSqlAuditSummaryResponseBody getBody() {
        return this.body;
    }

}
