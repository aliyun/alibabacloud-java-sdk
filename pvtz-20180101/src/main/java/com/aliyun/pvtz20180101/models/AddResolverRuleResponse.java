// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddResolverRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddResolverRuleResponseBody body;

    public static AddResolverRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddResolverRuleResponse self = new AddResolverRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddResolverRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddResolverRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddResolverRuleResponse setBody(AddResolverRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddResolverRuleResponseBody getBody() {
        return this.body;
    }

}
