// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryScriptsByStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryScriptsByStatusResponseBody body;

    public static QueryScriptsByStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScriptsByStatusResponse self = new QueryScriptsByStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryScriptsByStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryScriptsByStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryScriptsByStatusResponse setBody(QueryScriptsByStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryScriptsByStatusResponseBody getBody() {
        return this.body;
    }

}
