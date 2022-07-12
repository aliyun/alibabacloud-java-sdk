// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateTmMonitorRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTmMonitorRuleResponseBody body;

    public static UpdateTmMonitorRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTmMonitorRuleResponse self = new UpdateTmMonitorRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTmMonitorRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTmMonitorRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTmMonitorRuleResponse setBody(UpdateTmMonitorRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTmMonitorRuleResponseBody getBody() {
        return this.body;
    }

}
