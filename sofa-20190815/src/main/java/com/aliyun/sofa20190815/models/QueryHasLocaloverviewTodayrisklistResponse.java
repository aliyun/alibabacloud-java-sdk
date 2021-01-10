// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasLocaloverviewTodayrisklistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasLocaloverviewTodayrisklistResponseBody body;

    public static QueryHasLocaloverviewTodayrisklistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasLocaloverviewTodayrisklistResponse self = new QueryHasLocaloverviewTodayrisklistResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasLocaloverviewTodayrisklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasLocaloverviewTodayrisklistResponse setBody(QueryHasLocaloverviewTodayrisklistResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasLocaloverviewTodayrisklistResponseBody getBody() {
        return this.body;
    }

}
