// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ModifySlotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySlotResponseBody body;

    public static ModifySlotResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySlotResponse self = new ModifySlotResponse();
        return TeaModel.build(map, self);
    }

    public ModifySlotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySlotResponse setBody(ModifySlotResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySlotResponseBody getBody() {
        return this.body;
    }

}
