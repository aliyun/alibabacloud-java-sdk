// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionModuleRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyProtectionModuleRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyProtectionModuleRuleResponse setBody(ModifyProtectionModuleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProtectionModuleRuleResponseBody getBody() {
        return this.body;
    }

}
