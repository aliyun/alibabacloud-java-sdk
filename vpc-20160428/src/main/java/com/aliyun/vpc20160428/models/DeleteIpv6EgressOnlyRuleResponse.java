// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpv6EgressOnlyRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIpv6EgressOnlyRuleResponseBody body;

    public static DeleteIpv6EgressOnlyRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpv6EgressOnlyRuleResponse self = new DeleteIpv6EgressOnlyRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpv6EgressOnlyRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpv6EgressOnlyRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpv6EgressOnlyRuleResponse setBody(DeleteIpv6EgressOnlyRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpv6EgressOnlyRuleResponseBody getBody() {
        return this.body;
    }

}
