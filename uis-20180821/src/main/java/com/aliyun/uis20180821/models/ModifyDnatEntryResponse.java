// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifyDnatEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDnatEntryResponseBody body;

    public static ModifyDnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDnatEntryResponse self = new ModifyDnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDnatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDnatEntryResponse setBody(ModifyDnatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDnatEntryResponseBody getBody() {
        return this.body;
    }

}
