// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryIntentionOwnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryIntentionOwnerResponseBody body;

    public static QueryIntentionOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentionOwnerResponse self = new QueryIntentionOwnerResponse();
        return TeaModel.build(map, self);
    }

    public QueryIntentionOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIntentionOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIntentionOwnerResponse setBody(QueryIntentionOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIntentionOwnerResponseBody getBody() {
        return this.body;
    }

}
