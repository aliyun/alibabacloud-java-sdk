// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class RestartNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartNodesResponseBody body;

    public static RestartNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartNodesResponse self = new RestartNodesResponse();
        return TeaModel.build(map, self);
    }

    public RestartNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartNodesResponse setBody(RestartNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartNodesResponseBody getBody() {
        return this.body;
    }

}
