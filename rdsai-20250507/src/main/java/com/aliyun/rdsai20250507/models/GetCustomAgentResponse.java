// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetCustomAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomAgentResponseBody body;

    public static GetCustomAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomAgentResponse self = new GetCustomAgentResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomAgentResponse setBody(GetCustomAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomAgentResponseBody getBody() {
        return this.body;
    }

}
