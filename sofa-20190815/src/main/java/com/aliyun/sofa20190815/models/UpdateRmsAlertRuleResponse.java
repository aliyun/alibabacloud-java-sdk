// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateRmsAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRmsAlertRuleResponseBody body;

    public static UpdateRmsAlertRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRmsAlertRuleResponse self = new UpdateRmsAlertRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRmsAlertRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRmsAlertRuleResponse setBody(UpdateRmsAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRmsAlertRuleResponseBody getBody() {
        return this.body;
    }

}
