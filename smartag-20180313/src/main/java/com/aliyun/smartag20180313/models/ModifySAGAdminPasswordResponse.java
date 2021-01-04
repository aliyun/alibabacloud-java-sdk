// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySAGAdminPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySAGAdminPasswordResponseBody body;

    public static ModifySAGAdminPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySAGAdminPasswordResponse self = new ModifySAGAdminPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifySAGAdminPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySAGAdminPasswordResponse setBody(ModifySAGAdminPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySAGAdminPasswordResponseBody getBody() {
        return this.body;
    }

}
