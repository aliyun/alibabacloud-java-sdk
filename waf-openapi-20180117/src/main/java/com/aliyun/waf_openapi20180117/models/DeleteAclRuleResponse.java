// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DeleteAclRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAclRuleResponseBody body;

    public static DeleteAclRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAclRuleResponse self = new DeleteAclRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAclRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAclRuleResponse setBody(DeleteAclRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAclRuleResponseBody getBody() {
        return this.body;
    }

}
