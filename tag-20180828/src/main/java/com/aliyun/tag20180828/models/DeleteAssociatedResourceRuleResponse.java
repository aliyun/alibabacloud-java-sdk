// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class DeleteAssociatedResourceRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAssociatedResourceRuleResponseBody body;

    public static DeleteAssociatedResourceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAssociatedResourceRuleResponse self = new DeleteAssociatedResourceRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAssociatedResourceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAssociatedResourceRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAssociatedResourceRuleResponse setBody(DeleteAssociatedResourceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAssociatedResourceRuleResponseBody getBody() {
        return this.body;
    }

}
