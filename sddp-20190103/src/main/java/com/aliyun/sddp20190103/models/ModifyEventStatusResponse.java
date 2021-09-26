// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyEventStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyEventStatusResponseBody body;

    public static ModifyEventStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventStatusResponse self = new ModifyEventStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEventStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEventStatusResponse setBody(ModifyEventStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEventStatusResponseBody getBody() {
        return this.body;
    }

}
