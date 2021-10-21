// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeIntentionUserListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryTradeIntentionUserListResponse setBody(QueryTradeIntentionUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTradeIntentionUserListResponseBody getBody() {
        return this.body;
    }

}
