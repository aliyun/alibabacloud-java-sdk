// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSqlAuditStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPSqlAuditStatusResponseBody body;

    public static QueryODPSqlAuditStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSqlAuditStatusResponse self = new QueryODPSqlAuditStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPSqlAuditStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPSqlAuditStatusResponse setBody(QueryODPSqlAuditStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPSqlAuditStatusResponseBody getBody() {
        return this.body;
    }

}
