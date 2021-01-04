// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagHaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySagHaResponseBody body;

    public static ModifySagHaResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagHaResponse self = new ModifySagHaResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagHaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagHaResponse setBody(ModifySagHaResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagHaResponseBody getBody() {
        return this.body;
    }

}
