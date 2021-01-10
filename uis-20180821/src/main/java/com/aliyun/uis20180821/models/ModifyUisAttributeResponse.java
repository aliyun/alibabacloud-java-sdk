// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifyUisAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyUisAttributeResponseBody body;

    public static ModifyUisAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUisAttributeResponse self = new ModifyUisAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUisAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUisAttributeResponse setBody(ModifyUisAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUisAttributeResponseBody getBody() {
        return this.body;
    }

}
