// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloneHasInspectRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloneHasInspectRuleResponseBody body;

    public static CloneHasInspectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneHasInspectRuleResponse self = new CloneHasInspectRuleResponse();
        return TeaModel.build(map, self);
    }

    public CloneHasInspectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneHasInspectRuleResponse setBody(CloneHasInspectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneHasInspectRuleResponseBody getBody() {
        return this.body;
    }

}
