// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDatasetInfoResponseBody body;

    public static QueryDatasetInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetInfoResponse self = new QueryDatasetInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatasetInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDatasetInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDatasetInfoResponse setBody(QueryDatasetInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDatasetInfoResponseBody getBody() {
        return this.body;
    }

}
