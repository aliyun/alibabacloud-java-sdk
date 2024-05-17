// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class RevokePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokePermissionResponseBody body;

    public static RevokePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokePermissionResponse self = new RevokePermissionResponse();
        return TeaModel.build(map, self);
    }

    public RevokePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokePermissionResponse setBody(RevokePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokePermissionResponseBody getBody() {
        return this.body;
    }

}
