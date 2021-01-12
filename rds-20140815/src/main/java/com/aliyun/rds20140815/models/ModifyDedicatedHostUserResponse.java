// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDedicatedHostUserResponseBody body;

    public static ModifyDedicatedHostUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostUserResponse self = new ModifyDedicatedHostUserResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDedicatedHostUserResponse setBody(ModifyDedicatedHostUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDedicatedHostUserResponseBody getBody() {
        return this.body;
    }

}
