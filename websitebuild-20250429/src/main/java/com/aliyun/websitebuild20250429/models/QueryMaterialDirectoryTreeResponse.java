// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryMaterialDirectoryTreeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMaterialDirectoryTreeResponseBody body;

    public static QueryMaterialDirectoryTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialDirectoryTreeResponse self = new QueryMaterialDirectoryTreeResponse();
        return TeaModel.build(map, self);
    }

    public QueryMaterialDirectoryTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMaterialDirectoryTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMaterialDirectoryTreeResponse setBody(QueryMaterialDirectoryTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMaterialDirectoryTreeResponseBody getBody() {
        return this.body;
    }

}
