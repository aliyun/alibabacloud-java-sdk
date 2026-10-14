// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateClusterAgentConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateClusterAgentConfigResponseBody body;

    public static UpdateClusterAgentConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterAgentConfigResponse self = new UpdateClusterAgentConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterAgentConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterAgentConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClusterAgentConfigResponse setBody(UpdateClusterAgentConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterAgentConfigResponseBody getBody() {
        return this.body;
    }

}
