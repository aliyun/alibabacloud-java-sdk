// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class GetMcpServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMcpServiceResponseBody body;

    public static GetMcpServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMcpServiceResponse self = new GetMcpServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetMcpServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMcpServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMcpServiceResponse setBody(GetMcpServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMcpServiceResponseBody getBody() {
        return this.body;
    }

}
