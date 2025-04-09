// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyOutboundCallNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOutboundCallNumberResponseBody body;

    public static ModifyOutboundCallNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOutboundCallNumberResponse self = new ModifyOutboundCallNumberResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOutboundCallNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOutboundCallNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOutboundCallNumberResponse setBody(ModifyOutboundCallNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOutboundCallNumberResponseBody getBody() {
        return this.body;
    }

}
