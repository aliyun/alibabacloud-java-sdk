// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateNetworkDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNetworkDomainResponseBody body;

    public static CreateNetworkDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkDomainResponse self = new CreateNetworkDomainResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetworkDomainResponse setBody(CreateNetworkDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkDomainResponseBody getBody() {
        return this.body;
    }

}
