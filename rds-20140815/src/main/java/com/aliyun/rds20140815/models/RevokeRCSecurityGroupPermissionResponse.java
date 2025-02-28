// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RevokeRCSecurityGroupPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeRCSecurityGroupPermissionResponseBody body;

    public static RevokeRCSecurityGroupPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeRCSecurityGroupPermissionResponse self = new RevokeRCSecurityGroupPermissionResponse();
        return TeaModel.build(map, self);
    }

    public RevokeRCSecurityGroupPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeRCSecurityGroupPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeRCSecurityGroupPermissionResponse setBody(RevokeRCSecurityGroupPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeRCSecurityGroupPermissionResponseBody getBody() {
        return this.body;
    }

}
