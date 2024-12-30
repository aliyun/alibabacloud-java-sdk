// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetSmartqStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDatasetSmartqStatusResponseBody body;

    public static QueryDatasetSmartqStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetSmartqStatusResponse self = new QueryDatasetSmartqStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatasetSmartqStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDatasetSmartqStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDatasetSmartqStatusResponse setBody(QueryDatasetSmartqStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDatasetSmartqStatusResponseBody getBody() {
        return this.body;
    }

}
