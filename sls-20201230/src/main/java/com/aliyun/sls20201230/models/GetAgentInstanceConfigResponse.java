// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAgentInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentInstanceConfigResponseBody body;

    public static GetAgentInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentInstanceConfigResponse self = new GetAgentInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentInstanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentInstanceConfigResponse setBody(GetAgentInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
