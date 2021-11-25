// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class QueryTicketActionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTicketActionsResponseBody body;

    public static QueryTicketActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketActionsResponse self = new QueryTicketActionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTicketActionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTicketActionsResponse setBody(QueryTicketActionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTicketActionsResponseBody getBody() {
        return this.body;
    }

}
