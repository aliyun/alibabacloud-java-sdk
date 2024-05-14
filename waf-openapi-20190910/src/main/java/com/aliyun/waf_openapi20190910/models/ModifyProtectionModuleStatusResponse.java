// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionModuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyProtectionModuleStatusResponseBody body;

    public static ModifyProtectionModuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionModuleStatusResponse self = new ModifyProtectionModuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionModuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProtectionModuleStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyProtectionModuleStatusResponse setBody(ModifyProtectionModuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProtectionModuleStatusResponseBody getBody() {
        return this.body;
    }

}
