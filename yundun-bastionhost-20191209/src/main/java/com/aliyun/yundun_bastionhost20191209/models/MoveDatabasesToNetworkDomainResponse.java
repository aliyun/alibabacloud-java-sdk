// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class MoveDatabasesToNetworkDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveDatabasesToNetworkDomainResponseBody body;

    public static MoveDatabasesToNetworkDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveDatabasesToNetworkDomainResponse self = new MoveDatabasesToNetworkDomainResponse();
        return TeaModel.build(map, self);
    }

    public MoveDatabasesToNetworkDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveDatabasesToNetworkDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveDatabasesToNetworkDomainResponse setBody(MoveDatabasesToNetworkDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveDatabasesToNetworkDomainResponseBody getBody() {
        return this.body;
    }

}
