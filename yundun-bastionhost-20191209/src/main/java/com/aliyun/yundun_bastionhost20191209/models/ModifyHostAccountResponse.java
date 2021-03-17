// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHostAccountResponseBody body;

    public static ModifyHostAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostAccountResponse self = new ModifyHostAccountResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHostAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHostAccountResponse setBody(ModifyHostAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHostAccountResponseBody getBody() {
        return this.body;
    }

}
