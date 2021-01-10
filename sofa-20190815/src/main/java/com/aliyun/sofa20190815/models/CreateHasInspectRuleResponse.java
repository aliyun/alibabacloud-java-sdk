// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasInspectRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasInspectRuleResponseBody body;

    public static CreateHasInspectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasInspectRuleResponse self = new CreateHasInspectRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasInspectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasInspectRuleResponse setBody(CreateHasInspectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasInspectRuleResponseBody getBody() {
        return this.body;
    }

}
