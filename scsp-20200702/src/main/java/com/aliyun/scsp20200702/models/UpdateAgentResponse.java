// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class UpdateAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAgentResponseBody body;

    public static UpdateAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentResponse self = new UpdateAgentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentResponse setBody(UpdateAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentResponseBody getBody() {
        return this.body;
    }

}
