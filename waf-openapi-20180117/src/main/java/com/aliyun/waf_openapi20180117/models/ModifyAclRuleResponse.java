// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class ModifyAclRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAclRuleResponseBody body;

    public static ModifyAclRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAclRuleResponse self = new ModifyAclRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAclRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAclRuleResponse setBody(ModifyAclRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAclRuleResponseBody getBody() {
        return this.body;
    }

}
