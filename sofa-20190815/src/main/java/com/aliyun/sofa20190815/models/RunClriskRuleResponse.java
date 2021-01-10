// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RunClriskRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunClriskRuleResponseBody body;

    public static RunClriskRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        RunClriskRuleResponse self = new RunClriskRuleResponse();
        return TeaModel.build(map, self);
    }

    public RunClriskRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunClriskRuleResponse setBody(RunClriskRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public RunClriskRuleResponseBody getBody() {
        return this.body;
    }

}
