// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class CreateProtectionModuleRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateProtectionModuleRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProtectionModuleRuleResponse setBody(CreateProtectionModuleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProtectionModuleRuleResponseBody getBody() {
        return this.body;
    }

}
