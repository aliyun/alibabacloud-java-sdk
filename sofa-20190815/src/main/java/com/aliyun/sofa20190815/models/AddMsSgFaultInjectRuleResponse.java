// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsSgFaultInjectRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsSgFaultInjectRuleResponseBody body;

    public static AddMsSgFaultInjectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsSgFaultInjectRuleResponse self = new AddMsSgFaultInjectRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddMsSgFaultInjectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsSgFaultInjectRuleResponse setBody(AddMsSgFaultInjectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsSgFaultInjectRuleResponseBody getBody() {
        return this.body;
    }

}
