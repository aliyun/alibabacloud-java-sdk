// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgFaultInjectRuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsSgFaultInjectRuleStatusResponseBody body;

    public static UpdateMsSgFaultInjectRuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgFaultInjectRuleStatusResponse self = new UpdateMsSgFaultInjectRuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgFaultInjectRuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsSgFaultInjectRuleStatusResponse setBody(UpdateMsSgFaultInjectRuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsSgFaultInjectRuleStatusResponseBody getBody() {
        return this.body;
    }

}
