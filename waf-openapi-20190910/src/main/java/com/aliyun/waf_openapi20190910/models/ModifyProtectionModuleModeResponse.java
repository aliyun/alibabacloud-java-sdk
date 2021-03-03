// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionModuleModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyProtectionModuleModeResponseBody body;

    public static ModifyProtectionModuleModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionModuleModeResponse self = new ModifyProtectionModuleModeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionModuleModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProtectionModuleModeResponse setBody(ModifyProtectionModuleModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProtectionModuleModeResponseBody getBody() {
        return this.body;
    }

}
