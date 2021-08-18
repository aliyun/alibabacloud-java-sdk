// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class UpdateAppExpMetricRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppExpMetricRuleResponseBody body;

    public static UpdateAppExpMetricRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppExpMetricRuleResponse self = new UpdateAppExpMetricRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppExpMetricRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppExpMetricRuleResponse setBody(UpdateAppExpMetricRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppExpMetricRuleResponseBody getBody() {
        return this.body;
    }

}
