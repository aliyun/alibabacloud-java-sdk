// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetDomainExtensionAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDomainExtensionAttributeResponseBody body;

    public static SetDomainExtensionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDomainExtensionAttributeResponse self = new SetDomainExtensionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public SetDomainExtensionAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDomainExtensionAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDomainExtensionAttributeResponse setBody(SetDomainExtensionAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDomainExtensionAttributeResponseBody getBody() {
        return this.body;
    }

}
