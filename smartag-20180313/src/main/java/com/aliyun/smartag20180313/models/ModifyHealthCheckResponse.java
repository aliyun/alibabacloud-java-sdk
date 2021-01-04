// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyHealthCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHealthCheckResponseBody body;

    public static ModifyHealthCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHealthCheckResponse self = new ModifyHealthCheckResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHealthCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHealthCheckResponse setBody(ModifyHealthCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHealthCheckResponseBody getBody() {
        return this.body;
    }

}
