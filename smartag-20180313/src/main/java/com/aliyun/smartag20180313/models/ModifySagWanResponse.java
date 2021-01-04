// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagWanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySagWanResponseBody body;

    public static ModifySagWanResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagWanResponse self = new ModifySagWanResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagWanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagWanResponse setBody(ModifySagWanResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagWanResponseBody getBody() {
        return this.body;
    }

}
