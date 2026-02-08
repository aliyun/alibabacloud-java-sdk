// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryMaterialTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMaterialTaskDetailResponseBody body;

    public static QueryMaterialTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialTaskDetailResponse self = new QueryMaterialTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryMaterialTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMaterialTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMaterialTaskDetailResponse setBody(QueryMaterialTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMaterialTaskDetailResponseBody getBody() {
        return this.body;
    }

}
