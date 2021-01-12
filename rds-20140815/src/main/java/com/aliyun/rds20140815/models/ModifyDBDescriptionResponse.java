// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBDescriptionResponseBody body;

    public static ModifyDBDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBDescriptionResponse self = new ModifyDBDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBDescriptionResponse setBody(ModifyDBDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBDescriptionResponseBody getBody() {
        return this.body;
    }

}
