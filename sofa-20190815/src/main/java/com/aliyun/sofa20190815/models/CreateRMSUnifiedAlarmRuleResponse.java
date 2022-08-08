// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateRMSUnifiedAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRMSUnifiedAlarmRuleResponseBody body;

    public static CreateRMSUnifiedAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRMSUnifiedAlarmRuleResponse self = new CreateRMSUnifiedAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRMSUnifiedAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRMSUnifiedAlarmRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRMSUnifiedAlarmRuleResponse setBody(CreateRMSUnifiedAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRMSUnifiedAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
