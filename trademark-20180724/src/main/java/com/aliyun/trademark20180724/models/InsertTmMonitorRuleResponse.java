// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class InsertTmMonitorRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertTmMonitorRuleResponseBody body;

    public static InsertTmMonitorRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertTmMonitorRuleResponse self = new InsertTmMonitorRuleResponse();
        return TeaModel.build(map, self);
    }

    public InsertTmMonitorRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertTmMonitorRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertTmMonitorRuleResponse setBody(InsertTmMonitorRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertTmMonitorRuleResponseBody getBody() {
        return this.body;
    }

}
