// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyForwardEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyForwardEntryResponseBody body;

    public static ModifyForwardEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyForwardEntryResponse self = new ModifyForwardEntryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyForwardEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyForwardEntryResponse setBody(ModifyForwardEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyForwardEntryResponseBody getBody() {
        return this.body;
    }

}
