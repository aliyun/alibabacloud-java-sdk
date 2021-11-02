// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFlowResponseBody body;

    public static QueryFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowResponse self = new QueryFlowResponse();
        return TeaModel.build(map, self);
    }

    public QueryFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFlowResponse setBody(QueryFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFlowResponseBody getBody() {
        return this.body;
    }

}
