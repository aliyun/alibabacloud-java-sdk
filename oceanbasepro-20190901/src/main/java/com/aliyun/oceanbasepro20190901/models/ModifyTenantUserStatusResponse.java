// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTenantUserStatusResponseBody body;

    public static ModifyTenantUserStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantUserStatusResponse self = new ModifyTenantUserStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantUserStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantUserStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTenantUserStatusResponse setBody(ModifyTenantUserStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantUserStatusResponseBody getBody() {
        return this.body;
    }

}
