// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTagValueNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTagValueNameResponseBody body;

    public static ModifyTagValueNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagValueNameResponse self = new ModifyTagValueNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTagValueNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTagValueNameResponse setBody(ModifyTagValueNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTagValueNameResponseBody getBody() {
        return this.body;
    }

}
