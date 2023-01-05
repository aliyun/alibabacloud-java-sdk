// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyScriptResponseBody body;

    public static ModifyScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyScriptResponse self = new ModifyScriptResponse();
        return TeaModel.build(map, self);
    }

    public ModifyScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyScriptResponse setBody(ModifyScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScriptResponseBody getBody() {
        return this.body;
    }

}
