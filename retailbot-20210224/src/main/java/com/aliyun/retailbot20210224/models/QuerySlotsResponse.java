// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QuerySlotsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySlotsResponseBody body;

    public static QuerySlotsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySlotsResponse self = new QuerySlotsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySlotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySlotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySlotsResponse setBody(QuerySlotsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySlotsResponseBody getBody() {
        return this.body;
    }

}
