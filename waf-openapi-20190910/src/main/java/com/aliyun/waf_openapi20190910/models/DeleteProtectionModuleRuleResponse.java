// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DeleteProtectionModuleRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteProtectionModuleRuleResponse setBody(DeleteProtectionModuleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProtectionModuleRuleResponseBody getBody() {
        return this.body;
    }

}
