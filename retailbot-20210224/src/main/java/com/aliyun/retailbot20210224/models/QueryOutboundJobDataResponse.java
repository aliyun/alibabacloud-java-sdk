// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOutboundJobDataResponseBody body;

    public static QueryOutboundJobDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobDataResponse self = new QueryOutboundJobDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOutboundJobDataResponse setBody(QueryOutboundJobDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOutboundJobDataResponseBody getBody() {
        return this.body;
    }

}
