// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecModuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApisecModuleStatusResponseBody body;

    public static ModifyApisecModuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecModuleStatusResponse self = new ModifyApisecModuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApisecModuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApisecModuleStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApisecModuleStatusResponse setBody(ModifyApisecModuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApisecModuleStatusResponseBody getBody() {
        return this.body;
    }

}
