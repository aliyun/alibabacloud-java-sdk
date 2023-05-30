// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantSecurityIpGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTenantSecurityIpGroupResponseBody body;

    public static DeleteTenantSecurityIpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantSecurityIpGroupResponse self = new DeleteTenantSecurityIpGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTenantSecurityIpGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTenantSecurityIpGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTenantSecurityIpGroupResponse setBody(DeleteTenantSecurityIpGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTenantSecurityIpGroupResponseBody getBody() {
        return this.body;
    }

}
