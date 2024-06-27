// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class PermissionCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PermissionCheckResponseBody body;

    public static PermissionCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        PermissionCheckResponse self = new PermissionCheckResponse();
        return TeaModel.build(map, self);
    }

    public PermissionCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PermissionCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PermissionCheckResponse setBody(PermissionCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public PermissionCheckResponseBody getBody() {
        return this.body;
    }

}
