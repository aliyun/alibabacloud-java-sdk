// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateTaskAssignRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTaskAssignRuleResponseBody body;

    public static CreateTaskAssignRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskAssignRuleResponse self = new CreateTaskAssignRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateTaskAssignRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTaskAssignRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTaskAssignRuleResponse setBody(CreateTaskAssignRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTaskAssignRuleResponseBody getBody() {
        return this.body;
    }

}
