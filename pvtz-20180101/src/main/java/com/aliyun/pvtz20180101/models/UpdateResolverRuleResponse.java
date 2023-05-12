// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateResolverRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateResolverRuleResponseBody body;

    public static UpdateResolverRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResolverRuleResponse self = new UpdateResolverRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResolverRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResolverRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResolverRuleResponse setBody(UpdateResolverRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResolverRuleResponseBody getBody() {
        return this.body;
    }

}
