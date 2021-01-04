// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagUserDnsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySagUserDnsResponseBody body;

    public static ModifySagUserDnsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagUserDnsResponse self = new ModifySagUserDnsResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagUserDnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagUserDnsResponse setBody(ModifySagUserDnsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagUserDnsResponseBody getBody() {
        return this.body;
    }

}
