// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyWhitelistTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWhitelistTemplateResponseBody body;

    public static ModifyWhitelistTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWhitelistTemplateResponse self = new ModifyWhitelistTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWhitelistTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWhitelistTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWhitelistTemplateResponse setBody(ModifyWhitelistTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWhitelistTemplateResponseBody getBody() {
        return this.body;
    }

}
