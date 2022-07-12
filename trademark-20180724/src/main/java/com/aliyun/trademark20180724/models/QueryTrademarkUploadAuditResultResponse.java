// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkUploadAuditResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTrademarkUploadAuditResultResponseBody body;

    public static QueryTrademarkUploadAuditResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkUploadAuditResultResponse self = new QueryTrademarkUploadAuditResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkUploadAuditResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrademarkUploadAuditResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTrademarkUploadAuditResultResponse setBody(QueryTrademarkUploadAuditResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrademarkUploadAuditResultResponseBody getBody() {
        return this.body;
    }

}
