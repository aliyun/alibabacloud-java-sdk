// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyFullNatEntryAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyFullNatEntryAttributeResponseBody body;

    public static ModifyFullNatEntryAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFullNatEntryAttributeResponse self = new ModifyFullNatEntryAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFullNatEntryAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFullNatEntryAttributeResponse setBody(ModifyFullNatEntryAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFullNatEntryAttributeResponseBody getBody() {
        return this.body;
    }

}
