// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class InsertTmMonitorRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public InsertTmMonitorRuleResponse setBody(InsertTmMonitorRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertTmMonitorRuleResponseBody getBody() {
        return this.body;
    }

}
