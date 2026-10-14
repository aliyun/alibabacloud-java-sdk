// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateAgentConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAgentConfigResponseBody body;

    public static UpdateAgentConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentConfigResponse self = new UpdateAgentConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgentConfigResponse setBody(UpdateAgentConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentConfigResponseBody getBody() {
        return this.body;
    }

}
