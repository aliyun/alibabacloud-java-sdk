// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantSecurityIpGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTenantSecurityIpGroupResponseBody body;

    public static ModifyTenantSecurityIpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantSecurityIpGroupResponse self = new ModifyTenantSecurityIpGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantSecurityIpGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantSecurityIpGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTenantSecurityIpGroupResponse setBody(ModifyTenantSecurityIpGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantSecurityIpGroupResponseBody getBody() {
        return this.body;
    }

}
