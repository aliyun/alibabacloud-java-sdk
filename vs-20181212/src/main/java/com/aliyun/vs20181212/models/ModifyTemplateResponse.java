// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTemplateResponseBody body;

    public static ModifyTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateResponse self = new ModifyTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTemplateResponse setBody(ModifyTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTemplateResponseBody getBody() {
        return this.body;
    }

}
