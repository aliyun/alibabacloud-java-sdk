// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyAgentProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAgentProfileResponseBody body;

    public static ModifyAgentProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgentProfileResponse self = new ModifyAgentProfileResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAgentProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAgentProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAgentProfileResponse setBody(ModifyAgentProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAgentProfileResponseBody getBody() {
        return this.body;
    }

}
