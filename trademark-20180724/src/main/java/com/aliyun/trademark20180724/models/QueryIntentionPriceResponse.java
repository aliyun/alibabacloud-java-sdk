// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryIntentionPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryIntentionPriceResponseBody body;

    public static QueryIntentionPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentionPriceResponse self = new QueryIntentionPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryIntentionPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIntentionPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIntentionPriceResponse setBody(QueryIntentionPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIntentionPriceResponseBody getBody() {
        return this.body;
    }

}
