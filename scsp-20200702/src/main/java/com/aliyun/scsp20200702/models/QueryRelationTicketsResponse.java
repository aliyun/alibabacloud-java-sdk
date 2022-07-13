// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryRelationTicketsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRelationTicketsResponseBody body;

    public static QueryRelationTicketsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRelationTicketsResponse self = new QueryRelationTicketsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRelationTicketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRelationTicketsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRelationTicketsResponse setBody(QueryRelationTicketsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRelationTicketsResponseBody getBody() {
        return this.body;
    }

}
