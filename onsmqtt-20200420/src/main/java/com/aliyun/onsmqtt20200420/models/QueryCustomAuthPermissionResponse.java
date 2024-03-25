// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryCustomAuthPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCustomAuthPermissionResponseBody body;

    public static QueryCustomAuthPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomAuthPermissionResponse self = new QueryCustomAuthPermissionResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomAuthPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCustomAuthPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCustomAuthPermissionResponse setBody(QueryCustomAuthPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCustomAuthPermissionResponseBody getBody() {
        return this.body;
    }

}
