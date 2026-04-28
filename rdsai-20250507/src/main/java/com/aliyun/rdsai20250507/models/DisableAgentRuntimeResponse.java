// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DisableAgentRuntimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableAgentRuntimeResponseBody body;

    public static DisableAgentRuntimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAgentRuntimeResponse self = new DisableAgentRuntimeResponse();
        return TeaModel.build(map, self);
    }

    public DisableAgentRuntimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAgentRuntimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableAgentRuntimeResponse setBody(DisableAgentRuntimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAgentRuntimeResponseBody getBody() {
        return this.body;
    }

}
