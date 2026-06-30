// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifySandboxTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySandboxTemplateResponseBody body;

    public static ModifySandboxTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySandboxTemplateResponse self = new ModifySandboxTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifySandboxTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySandboxTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySandboxTemplateResponse setBody(ModifySandboxTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySandboxTemplateResponseBody getBody() {
        return this.body;
    }

}
