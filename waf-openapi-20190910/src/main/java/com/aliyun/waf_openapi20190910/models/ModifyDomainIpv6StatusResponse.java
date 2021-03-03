// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyDomainIpv6StatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyDomainIpv6StatusResponse setBody(ModifyDomainIpv6StatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDomainIpv6StatusResponseBody getBody() {
        return this.body;
    }

}
