// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryMinorVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMinorVersionResponseBody body;

    public static QueryMinorVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMinorVersionResponse self = new QueryMinorVersionResponse();
        return TeaModel.build(map, self);
    }

    public QueryMinorVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMinorVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMinorVersionResponse setBody(QueryMinorVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMinorVersionResponseBody getBody() {
        return this.body;
    }

}
