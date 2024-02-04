// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeIntentionUserListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTradeIntentionUserListResponseBody body;

    public static QueryTradeIntentionUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeIntentionUserListResponse self = new QueryTradeIntentionUserListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTradeIntentionUserListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTradeIntentionUserListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTradeIntentionUserListResponse setBody(QueryTradeIntentionUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTradeIntentionUserListResponseBody getBody() {
        return this.body;
    }

}
