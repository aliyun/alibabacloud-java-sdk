// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RemovePolarClawMCPServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemovePolarClawMCPServerResponseBody body;

    public static RemovePolarClawMCPServerResponse build(java.util.Map<String, ?> map) throws Exception {
        RemovePolarClawMCPServerResponse self = new RemovePolarClawMCPServerResponse();
        return TeaModel.build(map, self);
    }

    public RemovePolarClawMCPServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemovePolarClawMCPServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemovePolarClawMCPServerResponse setBody(RemovePolarClawMCPServerResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePolarClawMCPServerResponseBody getBody() {
        return this.body;
    }

}
