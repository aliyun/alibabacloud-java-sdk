// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectRuleResponseBody body;

    public static GetHasInspectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectRuleResponse self = new GetHasInspectRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectRuleResponse setBody(GetHasInspectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectRuleResponseBody getBody() {
        return this.body;
    }

}
