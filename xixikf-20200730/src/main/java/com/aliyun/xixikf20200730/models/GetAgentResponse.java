// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentResponseBody body;

    public static GetAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentResponse self = new GetAgentResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentResponse setBody(GetAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentResponseBody getBody() {
        return this.body;
    }

}
