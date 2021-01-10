// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasInspectRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasInspectRuleResponseBody body;

    public static UpdateHasInspectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasInspectRuleResponse self = new UpdateHasInspectRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasInspectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasInspectRuleResponse setBody(UpdateHasInspectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasInspectRuleResponseBody getBody() {
        return this.body;
    }

}
