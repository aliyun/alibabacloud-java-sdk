// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSqlAuditInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPSqlAuditInstancesResponseBody body;

    public static QueryODPSqlAuditInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSqlAuditInstancesResponse self = new QueryODPSqlAuditInstancesResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPSqlAuditInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPSqlAuditInstancesResponse setBody(QueryODPSqlAuditInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPSqlAuditInstancesResponseBody getBody() {
        return this.body;
    }

}
