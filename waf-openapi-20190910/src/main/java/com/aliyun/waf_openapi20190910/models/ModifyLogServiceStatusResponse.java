// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyLogServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyLogServiceStatusResponseBody body;

    public static ModifyLogServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogServiceStatusResponse self = new ModifyLogServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLogServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLogServiceStatusResponse setBody(ModifyLogServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLogServiceStatusResponseBody getBody() {
        return this.body;
    }

}
