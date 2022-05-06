// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyPGHbaConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPGHbaConfigResponseBody body;

    public static ModifyPGHbaConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPGHbaConfigResponse self = new ModifyPGHbaConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPGHbaConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPGHbaConfigResponse setBody(ModifyPGHbaConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPGHbaConfigResponseBody getBody() {
        return this.body;
    }

}
