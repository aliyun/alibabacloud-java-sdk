// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableDSTTraceAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableDSTTraceAgentResponseBody body;

    public static EnableDSTTraceAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDSTTraceAgentResponse self = new EnableDSTTraceAgentResponse();
        return TeaModel.build(map, self);
    }

    public EnableDSTTraceAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDSTTraceAgentResponse setBody(EnableDSTTraceAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDSTTraceAgentResponseBody getBody() {
        return this.body;
    }

}
