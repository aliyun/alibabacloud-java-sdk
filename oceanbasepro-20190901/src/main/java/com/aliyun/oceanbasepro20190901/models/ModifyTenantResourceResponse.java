// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTenantResourceResponseBody body;

    public static ModifyTenantResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantResourceResponse self = new ModifyTenantResourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTenantResourceResponse setBody(ModifyTenantResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantResourceResponseBody getBody() {
        return this.body;
    }

}
