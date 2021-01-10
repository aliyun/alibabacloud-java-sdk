// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgFaultInjectRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsSgFaultInjectRuleResponseBody body;

    public static UpdateMsSgFaultInjectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgFaultInjectRuleResponse self = new UpdateMsSgFaultInjectRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgFaultInjectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsSgFaultInjectRuleResponse setBody(UpdateMsSgFaultInjectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsSgFaultInjectRuleResponseBody getBody() {
        return this.body;
    }

}
