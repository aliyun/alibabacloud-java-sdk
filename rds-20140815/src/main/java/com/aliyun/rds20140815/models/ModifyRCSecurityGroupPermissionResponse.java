// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCSecurityGroupPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRCSecurityGroupPermissionResponseBody body;

    public static ModifyRCSecurityGroupPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCSecurityGroupPermissionResponse self = new ModifyRCSecurityGroupPermissionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRCSecurityGroupPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRCSecurityGroupPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRCSecurityGroupPermissionResponse setBody(ModifyRCSecurityGroupPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRCSecurityGroupPermissionResponseBody getBody() {
        return this.body;
    }

}
