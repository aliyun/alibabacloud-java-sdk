// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class CreateProtectionModuleRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProtectionModuleRuleResponseBody body;

    public static CreateProtectionModuleRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProtectionModuleRuleResponse self = new CreateProtectionModuleRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateProtectionModuleRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProtectionModuleRuleResponse setBody(CreateProtectionModuleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProtectionModuleRuleResponseBody getBody() {
        return this.body;
    }

}
