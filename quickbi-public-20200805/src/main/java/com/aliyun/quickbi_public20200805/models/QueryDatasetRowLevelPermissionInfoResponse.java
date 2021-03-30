// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class QueryDatasetRowLevelPermissionInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDatasetRowLevelPermissionInfoResponseBody body;

    public static QueryDatasetRowLevelPermissionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetRowLevelPermissionInfoResponse self = new QueryDatasetRowLevelPermissionInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatasetRowLevelPermissionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDatasetRowLevelPermissionInfoResponse setBody(QueryDatasetRowLevelPermissionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDatasetRowLevelPermissionInfoResponseBody getBody() {
        return this.body;
    }

}
