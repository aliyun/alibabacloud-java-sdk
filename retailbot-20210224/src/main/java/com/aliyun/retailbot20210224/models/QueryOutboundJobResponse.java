// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOutboundJobResponseBody body;

    public static QueryOutboundJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobResponse self = new QueryOutboundJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOutboundJobResponse setBody(QueryOutboundJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOutboundJobResponseBody getBody() {
        return this.body;
    }

}
