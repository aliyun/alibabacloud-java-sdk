// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRMSUnifiedAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRMSUnifiedAlarmRuleResponseBody body;

    public static DeleteRMSUnifiedAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRMSUnifiedAlarmRuleResponse self = new DeleteRMSUnifiedAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRMSUnifiedAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRMSUnifiedAlarmRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRMSUnifiedAlarmRuleResponse setBody(DeleteRMSUnifiedAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRMSUnifiedAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
