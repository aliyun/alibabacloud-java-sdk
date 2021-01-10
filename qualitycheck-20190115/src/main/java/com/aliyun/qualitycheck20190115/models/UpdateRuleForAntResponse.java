// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateRuleForAntResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRuleForAntResponseBody body;

    public static UpdateRuleForAntResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleForAntResponse self = new UpdateRuleForAntResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRuleForAntResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRuleForAntResponse setBody(UpdateRuleForAntResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRuleForAntResponseBody getBody() {
        return this.body;
    }

}
