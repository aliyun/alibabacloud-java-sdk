// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class QueryTicketCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTicketCountResponseBody body;

    public static QueryTicketCountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketCountResponse self = new QueryTicketCountResponse();
        return TeaModel.build(map, self);
    }

    public QueryTicketCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTicketCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTicketCountResponse setBody(QueryTicketCountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTicketCountResponseBody getBody() {
        return this.body;
    }

}
