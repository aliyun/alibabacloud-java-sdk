// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawAgentToolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePolarClawAgentToolsResponseBody body;

    public static UpdatePolarClawAgentToolsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawAgentToolsResponse self = new UpdatePolarClawAgentToolsResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawAgentToolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePolarClawAgentToolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePolarClawAgentToolsResponse setBody(UpdatePolarClawAgentToolsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePolarClawAgentToolsResponseBody getBody() {
        return this.body;
    }

}
