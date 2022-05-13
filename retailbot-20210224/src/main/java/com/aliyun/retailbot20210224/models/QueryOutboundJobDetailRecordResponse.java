// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobDetailRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOutboundJobDetailRecordResponseBody body;

    public static QueryOutboundJobDetailRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobDetailRecordResponse self = new QueryOutboundJobDetailRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobDetailRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOutboundJobDetailRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOutboundJobDetailRecordResponse setBody(QueryOutboundJobDetailRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOutboundJobDetailRecordResponseBody getBody() {
        return this.body;
    }

}
