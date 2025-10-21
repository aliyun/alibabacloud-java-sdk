// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class FetchSqlPreviewResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FetchSqlPreviewResultsResponseBody body;

    public static FetchSqlPreviewResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchSqlPreviewResultsResponse self = new FetchSqlPreviewResultsResponse();
        return TeaModel.build(map, self);
    }

    public FetchSqlPreviewResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchSqlPreviewResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchSqlPreviewResultsResponse setBody(FetchSqlPreviewResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchSqlPreviewResultsResponseBody getBody() {
        return this.body;
    }

}
