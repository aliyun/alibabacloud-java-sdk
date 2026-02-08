// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryMaterialTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMaterialTaskListResponseBody body;

    public static QueryMaterialTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialTaskListResponse self = new QueryMaterialTaskListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMaterialTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMaterialTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMaterialTaskListResponse setBody(QueryMaterialTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMaterialTaskListResponseBody getBody() {
        return this.body;
    }

}
