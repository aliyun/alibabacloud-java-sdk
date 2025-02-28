// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AuthorizeRCSecurityGroupPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeRCSecurityGroupPermissionResponseBody body;

    public static AuthorizeRCSecurityGroupPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeRCSecurityGroupPermissionResponse self = new AuthorizeRCSecurityGroupPermissionResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeRCSecurityGroupPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeRCSecurityGroupPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeRCSecurityGroupPermissionResponse setBody(AuthorizeRCSecurityGroupPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeRCSecurityGroupPermissionResponseBody getBody() {
        return this.body;
    }

}
