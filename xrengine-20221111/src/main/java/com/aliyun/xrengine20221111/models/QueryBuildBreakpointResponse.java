// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class QueryBuildBreakpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBuildBreakpointResponseBody body;

    public static QueryBuildBreakpointResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildBreakpointResponse self = new QueryBuildBreakpointResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildBreakpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBuildBreakpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBuildBreakpointResponse setBody(QueryBuildBreakpointResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBuildBreakpointResponseBody getBody() {
        return this.body;
    }

}
