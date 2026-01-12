// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class QueryAreaMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAreaMapResponseBody body;

    public static QueryAreaMapResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAreaMapResponse self = new QueryAreaMapResponse();
        return TeaModel.build(map, self);
    }

    public QueryAreaMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAreaMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAreaMapResponse setBody(QueryAreaMapResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAreaMapResponseBody getBody() {
        return this.body;
    }

}
