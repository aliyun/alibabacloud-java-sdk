// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ModifySlotTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySlotTemplateResponseBody body;

    public static ModifySlotTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySlotTemplateResponse self = new ModifySlotTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifySlotTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySlotTemplateResponse setBody(ModifySlotTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySlotTemplateResponseBody getBody() {
        return this.body;
    }

}
