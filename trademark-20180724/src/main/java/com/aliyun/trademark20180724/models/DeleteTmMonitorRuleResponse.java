// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class DeleteTmMonitorRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTmMonitorRuleResponseBody body;

    public static DeleteTmMonitorRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTmMonitorRuleResponse self = new DeleteTmMonitorRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTmMonitorRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTmMonitorRuleResponse setBody(DeleteTmMonitorRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTmMonitorRuleResponseBody getBody() {
        return this.body;
    }

}
