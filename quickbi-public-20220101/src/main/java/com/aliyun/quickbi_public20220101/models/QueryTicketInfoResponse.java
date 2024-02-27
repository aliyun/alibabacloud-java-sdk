// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryTicketInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTicketInfoResponseBody body;

    public static QueryTicketInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketInfoResponse self = new QueryTicketInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryTicketInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTicketInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTicketInfoResponse setBody(QueryTicketInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTicketInfoResponseBody getBody() {
        return this.body;
    }

}
