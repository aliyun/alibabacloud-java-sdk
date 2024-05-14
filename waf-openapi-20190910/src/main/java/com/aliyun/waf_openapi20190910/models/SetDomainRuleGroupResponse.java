// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class SetDomainRuleGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetDomainRuleGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDomainRuleGroupResponse setBody(SetDomainRuleGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDomainRuleGroupResponseBody getBody() {
        return this.body;
    }

}
