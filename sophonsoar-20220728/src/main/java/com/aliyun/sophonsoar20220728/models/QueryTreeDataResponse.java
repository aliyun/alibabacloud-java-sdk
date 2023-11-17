// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class QueryTreeDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTreeDataResponseBody body;

    public static QueryTreeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTreeDataResponse self = new QueryTreeDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryTreeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTreeDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTreeDataResponse setBody(QueryTreeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTreeDataResponseBody getBody() {
        return this.body;
    }

}
