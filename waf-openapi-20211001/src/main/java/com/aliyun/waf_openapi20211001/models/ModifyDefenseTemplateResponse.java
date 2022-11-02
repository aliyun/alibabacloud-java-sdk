// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDefenseTemplateResponseBody body;

    public static ModifyDefenseTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseTemplateResponse self = new ModifyDefenseTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDefenseTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDefenseTemplateResponse setBody(ModifyDefenseTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDefenseTemplateResponseBody getBody() {
        return this.body;
    }

}
