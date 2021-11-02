// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryAvailableBalanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAvailableBalanceResponseBody body;

    public static QueryAvailableBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailableBalanceResponse self = new QueryAvailableBalanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAvailableBalanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAvailableBalanceResponse setBody(QueryAvailableBalanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAvailableBalanceResponseBody getBody() {
        return this.body;
    }

}
