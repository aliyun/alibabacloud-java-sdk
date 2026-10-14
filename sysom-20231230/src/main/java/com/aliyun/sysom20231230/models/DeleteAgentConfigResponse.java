// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class DeleteAgentConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgentConfigResponseBody body;

    public static DeleteAgentConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentConfigResponse self = new DeleteAgentConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentConfigResponse setBody(DeleteAgentConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgentConfigResponseBody getBody() {
        return this.body;
    }

}
