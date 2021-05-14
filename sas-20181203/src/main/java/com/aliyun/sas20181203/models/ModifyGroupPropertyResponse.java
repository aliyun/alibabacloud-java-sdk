// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyGroupPropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyGroupPropertyResponseBody body;

    public static ModifyGroupPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupPropertyResponse self = new ModifyGroupPropertyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGroupPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGroupPropertyResponse setBody(ModifyGroupPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGroupPropertyResponseBody getBody() {
        return this.body;
    }

}
