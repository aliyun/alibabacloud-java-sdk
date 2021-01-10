// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateTaskAssignRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTaskAssignRuleResponseBody body;

    public static UpdateTaskAssignRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskAssignRuleResponse self = new UpdateTaskAssignRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskAssignRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskAssignRuleResponse setBody(UpdateTaskAssignRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskAssignRuleResponseBody getBody() {
        return this.body;
    }

}
