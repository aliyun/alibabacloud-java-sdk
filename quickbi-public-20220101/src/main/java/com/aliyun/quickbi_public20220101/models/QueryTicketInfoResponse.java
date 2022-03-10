// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryTicketInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryTicketInfoResponse setBody(QueryTicketInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTicketInfoResponseBody getBody() {
        return this.body;
    }

}
