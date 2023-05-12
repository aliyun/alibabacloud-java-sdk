// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteResolverRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteResolverRuleResponseBody body;

    public static DeleteResolverRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResolverRuleResponse self = new DeleteResolverRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResolverRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResolverRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResolverRuleResponse setBody(DeleteResolverRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResolverRuleResponseBody getBody() {
        return this.body;
    }

}
