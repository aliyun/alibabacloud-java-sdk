// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDatasetListResponseBody body;

    public static QueryDatasetListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetListResponse self = new QueryDatasetListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatasetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDatasetListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDatasetListResponse setBody(QueryDatasetListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDatasetListResponseBody getBody() {
        return this.body;
    }

}
