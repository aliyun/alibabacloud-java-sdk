// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyCustomNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCustomNameResponseBody body;

    public static ModifyCustomNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomNameResponse self = new ModifyCustomNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCustomNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCustomNameResponse setBody(ModifyCustomNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCustomNameResponseBody getBody() {
        return this.body;
    }

}
