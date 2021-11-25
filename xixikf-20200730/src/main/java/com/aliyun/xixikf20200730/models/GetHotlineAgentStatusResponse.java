// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetHotlineAgentStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHotlineAgentStatusResponseBody body;

    public static GetHotlineAgentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineAgentStatusResponse self = new GetHotlineAgentStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetHotlineAgentStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotlineAgentStatusResponse setBody(GetHotlineAgentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotlineAgentStatusResponseBody getBody() {
        return this.body;
    }

}
