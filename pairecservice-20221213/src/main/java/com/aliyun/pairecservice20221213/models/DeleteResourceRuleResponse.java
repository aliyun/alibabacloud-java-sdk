// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteResourceRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteResourceRuleResponseBody body;

    public static DeleteResourceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceRuleResponse self = new DeleteResourceRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResourceRuleResponse setBody(DeleteResourceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceRuleResponseBody getBody() {
        return this.body;
    }

}
