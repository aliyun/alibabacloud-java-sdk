// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetDetailInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDatasetDetailInfoResponseBody body;

    public static QueryDatasetDetailInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetDetailInfoResponse self = new QueryDatasetDetailInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatasetDetailInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDatasetDetailInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDatasetDetailInfoResponse setBody(QueryDatasetDetailInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDatasetDetailInfoResponseBody getBody() {
        return this.body;
    }

}
