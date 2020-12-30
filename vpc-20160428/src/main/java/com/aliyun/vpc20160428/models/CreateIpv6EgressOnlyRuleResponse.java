// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpv6EgressOnlyRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIpv6EgressOnlyRuleResponseBody body;

    public static CreateIpv6EgressOnlyRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpv6EgressOnlyRuleResponse self = new CreateIpv6EgressOnlyRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpv6EgressOnlyRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpv6EgressOnlyRuleResponse setBody(CreateIpv6EgressOnlyRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpv6EgressOnlyRuleResponseBody getBody() {
        return this.body;
    }

}
