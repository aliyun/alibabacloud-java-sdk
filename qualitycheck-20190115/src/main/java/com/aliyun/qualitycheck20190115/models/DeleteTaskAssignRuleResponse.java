// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteTaskAssignRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTaskAssignRuleResponseBody body;

    public static DeleteTaskAssignRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskAssignRuleResponse self = new DeleteTaskAssignRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTaskAssignRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTaskAssignRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTaskAssignRuleResponse setBody(DeleteTaskAssignRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTaskAssignRuleResponseBody getBody() {
        return this.body;
    }

}
