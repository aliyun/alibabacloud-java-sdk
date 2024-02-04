// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantSecurityIpGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTenantSecurityIpGroupResponseBody body;

    public static CreateTenantSecurityIpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantSecurityIpGroupResponse self = new CreateTenantSecurityIpGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateTenantSecurityIpGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTenantSecurityIpGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTenantSecurityIpGroupResponse setBody(CreateTenantSecurityIpGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTenantSecurityIpGroupResponseBody getBody() {
        return this.body;
    }

}
