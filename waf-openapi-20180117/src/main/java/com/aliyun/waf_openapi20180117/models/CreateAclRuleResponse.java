// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class CreateAclRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAclRuleResponseBody body;

    public static CreateAclRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAclRuleResponse self = new CreateAclRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateAclRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAclRuleResponse setBody(CreateAclRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAclRuleResponseBody getBody() {
        return this.body;
    }

}
