// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyTagWithUuidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTagWithUuidResponseBody body;

    public static ModifyTagWithUuidResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagWithUuidResponse self = new ModifyTagWithUuidResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTagWithUuidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTagWithUuidResponse setBody(ModifyTagWithUuidResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTagWithUuidResponseBody getBody() {
        return this.body;
    }

}
