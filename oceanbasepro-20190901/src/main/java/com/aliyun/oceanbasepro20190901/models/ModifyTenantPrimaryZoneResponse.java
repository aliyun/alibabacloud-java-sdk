// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantPrimaryZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTenantPrimaryZoneResponseBody body;

    public static ModifyTenantPrimaryZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantPrimaryZoneResponse self = new ModifyTenantPrimaryZoneResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantPrimaryZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantPrimaryZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTenantPrimaryZoneResponse setBody(ModifyTenantPrimaryZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantPrimaryZoneResponseBody getBody() {
        return this.body;
    }

}
