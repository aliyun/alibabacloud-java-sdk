// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class FetchRemoteMcpToolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FetchRemoteMcpToolsResponseBody body;

    public static FetchRemoteMcpToolsResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchRemoteMcpToolsResponse self = new FetchRemoteMcpToolsResponse();
        return TeaModel.build(map, self);
    }

    public FetchRemoteMcpToolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchRemoteMcpToolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchRemoteMcpToolsResponse setBody(FetchRemoteMcpToolsResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchRemoteMcpToolsResponseBody getBody() {
        return this.body;
    }

}
