// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class SetDomainRuleGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDomainRuleGroupResponseBody body;

    public static SetDomainRuleGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDomainRuleGroupResponse self = new SetDomainRuleGroupResponse();
        return TeaModel.build(map, self);
    }

    public SetDomainRuleGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDomainRuleGroupResponse setBody(SetDomainRuleGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDomainRuleGroupResponseBody getBody() {
        return this.body;
    }

}
