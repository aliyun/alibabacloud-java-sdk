// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RevokeOperatorPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeOperatorPermissionResponseBody body;

    public static RevokeOperatorPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeOperatorPermissionResponse self = new RevokeOperatorPermissionResponse();
        return TeaModel.build(map, self);
    }

    public RevokeOperatorPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeOperatorPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeOperatorPermissionResponse setBody(RevokeOperatorPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeOperatorPermissionResponseBody getBody() {
        return this.body;
    }

}
