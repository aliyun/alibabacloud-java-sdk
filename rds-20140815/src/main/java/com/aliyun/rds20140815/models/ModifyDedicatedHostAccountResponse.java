// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDedicatedHostAccountResponseBody body;

    public static ModifyDedicatedHostAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAccountResponse self = new ModifyDedicatedHostAccountResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDedicatedHostAccountResponse setBody(ModifyDedicatedHostAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDedicatedHostAccountResponseBody getBody() {
        return this.body;
    }

}
