// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecApiResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApisecApiResourceResponseBody body;

    public static ModifyApisecApiResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecApiResourceResponse self = new ModifyApisecApiResourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApisecApiResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApisecApiResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApisecApiResourceResponse setBody(ModifyApisecApiResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApisecApiResourceResponseBody getBody() {
        return this.body;
    }

}
