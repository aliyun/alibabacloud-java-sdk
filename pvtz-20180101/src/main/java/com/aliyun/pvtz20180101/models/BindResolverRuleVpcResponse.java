// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class BindResolverRuleVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindResolverRuleVpcResponseBody body;

    public static BindResolverRuleVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        BindResolverRuleVpcResponse self = new BindResolverRuleVpcResponse();
        return TeaModel.build(map, self);
    }

    public BindResolverRuleVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindResolverRuleVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindResolverRuleVpcResponse setBody(BindResolverRuleVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public BindResolverRuleVpcResponseBody getBody() {
        return this.body;
    }

}
