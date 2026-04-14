// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CpuHighAgentStreamResponseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CpuHighAgentStreamResponseResponseBody body;

    public static CpuHighAgentStreamResponseResponse build(java.util.Map<String, ?> map) throws Exception {
        CpuHighAgentStreamResponseResponse self = new CpuHighAgentStreamResponseResponse();
        return TeaModel.build(map, self);
    }

    public CpuHighAgentStreamResponseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CpuHighAgentStreamResponseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CpuHighAgentStreamResponseResponse setBody(CpuHighAgentStreamResponseResponseBody body) {
        this.body = body;
        return this;
    }
    public CpuHighAgentStreamResponseResponseBody getBody() {
        return this.body;
    }

}
