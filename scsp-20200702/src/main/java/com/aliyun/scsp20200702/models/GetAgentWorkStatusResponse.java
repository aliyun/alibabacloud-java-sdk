// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAgentWorkStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentWorkStatusResponseBody body;

    public static GetAgentWorkStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentWorkStatusResponse self = new GetAgentWorkStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentWorkStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentWorkStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentWorkStatusResponse setBody(GetAgentWorkStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentWorkStatusResponseBody getBody() {
        return this.body;
    }

}
