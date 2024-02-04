// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeMarkApplicationsByIntentionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTradeMarkApplicationsByIntentionResponseBody body;

    public static QueryTradeMarkApplicationsByIntentionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeMarkApplicationsByIntentionResponse self = new QueryTradeMarkApplicationsByIntentionResponse();
        return TeaModel.build(map, self);
    }

    public QueryTradeMarkApplicationsByIntentionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTradeMarkApplicationsByIntentionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTradeMarkApplicationsByIntentionResponse setBody(QueryTradeMarkApplicationsByIntentionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTradeMarkApplicationsByIntentionResponseBody getBody() {
        return this.body;
    }

}
