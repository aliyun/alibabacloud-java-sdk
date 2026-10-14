// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAgentConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentConfigResponseBody body;

    public static GetAgentConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentConfigResponse self = new GetAgentConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentConfigResponse setBody(GetAgentConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentConfigResponseBody getBody() {
        return this.body;
    }

}
