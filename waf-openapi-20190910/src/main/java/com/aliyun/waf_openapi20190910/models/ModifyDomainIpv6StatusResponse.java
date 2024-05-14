// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyDomainIpv6StatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDomainIpv6StatusResponseBody body;

    public static ModifyDomainIpv6StatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainIpv6StatusResponse self = new ModifyDomainIpv6StatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDomainIpv6StatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDomainIpv6StatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDomainIpv6StatusResponse setBody(ModifyDomainIpv6StatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDomainIpv6StatusResponseBody getBody() {
        return this.body;
    }

}
