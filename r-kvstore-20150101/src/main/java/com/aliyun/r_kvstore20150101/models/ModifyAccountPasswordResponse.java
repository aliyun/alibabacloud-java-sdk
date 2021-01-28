// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyAccountPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAccountPasswordResponseBody body;

    public static ModifyAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPasswordResponse self = new ModifyAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountPasswordResponse setBody(ModifyAccountPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountPasswordResponseBody getBody() {
        return this.body;
    }

}
