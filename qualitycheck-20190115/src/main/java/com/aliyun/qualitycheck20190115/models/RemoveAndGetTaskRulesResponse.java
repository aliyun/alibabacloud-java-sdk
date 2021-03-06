// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RemoveAndGetTaskRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveAndGetTaskRulesResponseBody body;

    public static RemoveAndGetTaskRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAndGetTaskRulesResponse self = new RemoveAndGetTaskRulesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAndGetTaskRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAndGetTaskRulesResponse setBody(RemoveAndGetTaskRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAndGetTaskRulesResponseBody getBody() {
        return this.body;
    }

}
