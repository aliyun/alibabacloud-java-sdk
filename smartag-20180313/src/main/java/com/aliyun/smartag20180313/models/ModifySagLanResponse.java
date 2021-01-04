// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagLanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySagLanResponseBody body;

    public static ModifySagLanResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagLanResponse self = new ModifySagLanResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagLanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagLanResponse setBody(ModifySagLanResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagLanResponseBody getBody() {
        return this.body;
    }

}
