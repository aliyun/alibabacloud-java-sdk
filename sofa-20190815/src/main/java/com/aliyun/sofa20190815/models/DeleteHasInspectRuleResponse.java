// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasInspectRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasInspectRuleResponseBody body;

    public static DeleteHasInspectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasInspectRuleResponse self = new DeleteHasInspectRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasInspectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasInspectRuleResponse setBody(DeleteHasInspectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasInspectRuleResponseBody getBody() {
        return this.body;
    }

}
