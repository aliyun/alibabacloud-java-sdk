// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteNetworkDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNetworkDomainResponseBody body;

    public static DeleteNetworkDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkDomainResponse self = new DeleteNetworkDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkDomainResponse setBody(DeleteNetworkDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkDomainResponseBody getBody() {
        return this.body;
    }

}
