// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DeleteAppExpMetricRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppExpMetricRuleResponseBody body;

    public static DeleteAppExpMetricRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppExpMetricRuleResponse self = new DeleteAppExpMetricRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppExpMetricRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppExpMetricRuleResponse setBody(DeleteAppExpMetricRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppExpMetricRuleResponseBody getBody() {
        return this.body;
    }

}
