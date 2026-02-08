// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryMaterialFileListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMaterialFileListResponseBody body;

    public static QueryMaterialFileListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialFileListResponse self = new QueryMaterialFileListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMaterialFileListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMaterialFileListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMaterialFileListResponse setBody(QueryMaterialFileListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMaterialFileListResponseBody getBody() {
        return this.body;
    }

}
