// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetNetworkDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNetworkDomainResponseBody body;

    public static GetNetworkDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkDomainResponse self = new GetNetworkDomainResponse();
        return TeaModel.build(map, self);
    }

    public GetNetworkDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNetworkDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNetworkDomainResponse setBody(GetNetworkDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNetworkDomainResponseBody getBody() {
        return this.body;
    }

}
