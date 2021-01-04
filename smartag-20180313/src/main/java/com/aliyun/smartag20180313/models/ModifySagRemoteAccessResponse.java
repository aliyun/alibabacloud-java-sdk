// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagRemoteAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySagRemoteAccessResponseBody body;

    public static ModifySagRemoteAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagRemoteAccessResponse self = new ModifySagRemoteAccessResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagRemoteAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagRemoteAccessResponse setBody(ModifySagRemoteAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagRemoteAccessResponseBody getBody() {
        return this.body;
    }

}
