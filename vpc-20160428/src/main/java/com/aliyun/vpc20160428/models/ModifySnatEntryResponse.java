// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySnatEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySnatEntryResponseBody body;

    public static ModifySnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySnatEntryResponse self = new ModifySnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public ModifySnatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySnatEntryResponse setBody(ModifySnatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySnatEntryResponseBody getBody() {
        return this.body;
    }

}
