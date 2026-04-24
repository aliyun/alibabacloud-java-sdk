// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class EnableAgentRuntimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableAgentRuntimeResponseBody body;

    public static EnableAgentRuntimeResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAgentRuntimeResponse self = new EnableAgentRuntimeResponse();
        return TeaModel.build(map, self);
    }

    public EnableAgentRuntimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAgentRuntimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAgentRuntimeResponse setBody(EnableAgentRuntimeResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAgentRuntimeResponseBody getBody() {
        return this.body;
    }

}
