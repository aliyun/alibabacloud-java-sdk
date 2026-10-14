// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateInstanceAgentConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceAgentConfigResponseBody body;

    public static UpdateInstanceAgentConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceAgentConfigResponse self = new UpdateInstanceAgentConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceAgentConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceAgentConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceAgentConfigResponse setBody(UpdateInstanceAgentConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceAgentConfigResponseBody getBody() {
        return this.body;
    }

}
