// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class MoveHostsToNetworkDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveHostsToNetworkDomainResponseBody body;

    public static MoveHostsToNetworkDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveHostsToNetworkDomainResponse self = new MoveHostsToNetworkDomainResponse();
        return TeaModel.build(map, self);
    }

    public MoveHostsToNetworkDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveHostsToNetworkDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveHostsToNetworkDomainResponse setBody(MoveHostsToNetworkDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveHostsToNetworkDomainResponseBody getBody() {
        return this.body;
    }

}
