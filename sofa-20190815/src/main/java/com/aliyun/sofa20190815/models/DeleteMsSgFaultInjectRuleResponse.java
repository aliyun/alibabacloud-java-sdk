// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsSgFaultInjectRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsSgFaultInjectRuleResponseBody body;

    public static DeleteMsSgFaultInjectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsSgFaultInjectRuleResponse self = new DeleteMsSgFaultInjectRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsSgFaultInjectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsSgFaultInjectRuleResponse setBody(DeleteMsSgFaultInjectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsSgFaultInjectRuleResponseBody getBody() {
        return this.body;
    }

}
