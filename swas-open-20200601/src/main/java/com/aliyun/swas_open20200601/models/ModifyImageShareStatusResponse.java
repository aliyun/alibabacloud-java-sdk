// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyImageShareStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyImageShareStatusResponseBody body;

    public static ModifyImageShareStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageShareStatusResponse self = new ModifyImageShareStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyImageShareStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyImageShareStatusResponse setBody(ModifyImageShareStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyImageShareStatusResponseBody getBody() {
        return this.body;
    }

}
