// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteCostRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCostRuleResponseBody body;

    public static DeleteCostRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCostRuleResponse self = new DeleteCostRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCostRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCostRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCostRuleResponse setBody(DeleteCostRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCostRuleResponseBody getBody() {
        return this.body;
    }

}
