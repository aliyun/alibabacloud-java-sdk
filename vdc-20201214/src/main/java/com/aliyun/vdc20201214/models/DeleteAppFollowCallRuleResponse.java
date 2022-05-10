// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DeleteAppFollowCallRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppFollowCallRuleResponseBody body;

    public static DeleteAppFollowCallRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppFollowCallRuleResponse self = new DeleteAppFollowCallRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppFollowCallRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppFollowCallRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppFollowCallRuleResponse setBody(DeleteAppFollowCallRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppFollowCallRuleResponseBody getBody() {
        return this.body;
    }

}
