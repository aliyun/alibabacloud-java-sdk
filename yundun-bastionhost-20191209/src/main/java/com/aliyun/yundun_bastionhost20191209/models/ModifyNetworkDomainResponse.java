// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyNetworkDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyNetworkDomainResponseBody body;

    public static ModifyNetworkDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkDomainResponse self = new ModifyNetworkDomainResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNetworkDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNetworkDomainResponse setBody(ModifyNetworkDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNetworkDomainResponseBody getBody() {
        return this.body;
    }

}
