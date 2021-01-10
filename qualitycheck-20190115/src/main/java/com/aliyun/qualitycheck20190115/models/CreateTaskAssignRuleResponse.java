// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateTaskAssignRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateTaskAssignRuleResponse setBody(CreateTaskAssignRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTaskAssignRuleResponseBody getBody() {
        return this.body;
    }

}
