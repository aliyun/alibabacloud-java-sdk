// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyResourceTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyResourceTagResponseBody body;

    public static ModifyResourceTagResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceTagResponse self = new ModifyResourceTagResponse();
        return TeaModel.build(map, self);
    }

    public ModifyResourceTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyResourceTagResponse setBody(ModifyResourceTagResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyResourceTagResponseBody getBody() {
        return this.body;
    }

}
