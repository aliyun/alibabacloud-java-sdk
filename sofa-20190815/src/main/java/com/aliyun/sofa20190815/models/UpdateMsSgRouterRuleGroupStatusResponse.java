// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgRouterRuleGroupStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsSgRouterRuleGroupStatusResponseBody body;

    public static UpdateMsSgRouterRuleGroupStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgRouterRuleGroupStatusResponse self = new UpdateMsSgRouterRuleGroupStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgRouterRuleGroupStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsSgRouterRuleGroupStatusResponse setBody(UpdateMsSgRouterRuleGroupStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsSgRouterRuleGroupStatusResponseBody getBody() {
        return this.body;
    }

}
