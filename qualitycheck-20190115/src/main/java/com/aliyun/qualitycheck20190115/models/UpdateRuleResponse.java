// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRuleResponseBody body;

    public static UpdateRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleResponse self = new UpdateRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRuleResponse setBody(UpdateRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRuleResponseBody getBody() {
        return this.body;
    }

}
