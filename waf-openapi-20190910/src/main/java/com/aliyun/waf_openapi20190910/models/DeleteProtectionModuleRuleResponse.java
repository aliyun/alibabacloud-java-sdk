// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DeleteProtectionModuleRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProtectionModuleRuleResponseBody body;

    public static DeleteProtectionModuleRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProtectionModuleRuleResponse self = new DeleteProtectionModuleRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProtectionModuleRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProtectionModuleRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProtectionModuleRuleResponse setBody(DeleteProtectionModuleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProtectionModuleRuleResponseBody getBody() {
        return this.body;
    }

}
