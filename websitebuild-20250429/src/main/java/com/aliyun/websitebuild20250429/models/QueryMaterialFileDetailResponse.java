// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryMaterialFileDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMaterialFileDetailResponseBody body;

    public static QueryMaterialFileDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialFileDetailResponse self = new QueryMaterialFileDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryMaterialFileDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMaterialFileDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMaterialFileDetailResponse setBody(QueryMaterialFileDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMaterialFileDetailResponseBody getBody() {
        return this.body;
    }

}
