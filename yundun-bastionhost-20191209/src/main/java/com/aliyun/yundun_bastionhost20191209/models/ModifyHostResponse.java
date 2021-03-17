// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHostResponseBody body;

    public static ModifyHostResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostResponse self = new ModifyHostResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHostResponse setBody(ModifyHostResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHostResponseBody getBody() {
        return this.body;
    }

}
