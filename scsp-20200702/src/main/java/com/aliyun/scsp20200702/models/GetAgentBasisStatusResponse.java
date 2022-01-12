// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAgentBasisStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentBasisStatusResponseBody body;

    public static GetAgentBasisStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentBasisStatusResponse self = new GetAgentBasisStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentBasisStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentBasisStatusResponse setBody(GetAgentBasisStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentBasisStatusResponseBody getBody() {
        return this.body;
    }

}
