// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSqlAuditDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPSqlAuditDetailResponseBody body;

    public static QueryODPSqlAuditDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSqlAuditDetailResponse self = new QueryODPSqlAuditDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPSqlAuditDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPSqlAuditDetailResponse setBody(QueryODPSqlAuditDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPSqlAuditDetailResponseBody getBody() {
        return this.body;
    }

}
