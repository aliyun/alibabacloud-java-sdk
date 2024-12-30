// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QuerySmartqPermissionByCubeIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmartqPermissionByCubeIdResponseBody body;

    public static QuerySmartqPermissionByCubeIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmartqPermissionByCubeIdResponse self = new QuerySmartqPermissionByCubeIdResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmartqPermissionByCubeIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmartqPermissionByCubeIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmartqPermissionByCubeIdResponse setBody(QuerySmartqPermissionByCubeIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmartqPermissionByCubeIdResponseBody getBody() {
        return this.body;
    }

}
