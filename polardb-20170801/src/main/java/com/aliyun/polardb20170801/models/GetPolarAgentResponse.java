// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GetPolarAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPolarAgentResponseBody body;

    public static GetPolarAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolarAgentResponse self = new GetPolarAgentResponse();
        return TeaModel.build(map, self);
    }

    public GetPolarAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPolarAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPolarAgentResponse setBody(GetPolarAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolarAgentResponseBody getBody() {
        return this.body;
    }

}
