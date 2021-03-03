// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionModuleRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyProtectionModuleRuleResponseBody body;

    public static ModifyProtectionModuleRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionModuleRuleResponse self = new ModifyProtectionModuleRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionModuleRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProtectionModuleRuleResponse setBody(ModifyProtectionModuleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProtectionModuleRuleResponseBody getBody() {
        return this.body;
    }

}
