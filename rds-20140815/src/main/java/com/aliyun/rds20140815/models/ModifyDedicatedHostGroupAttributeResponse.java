// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDedicatedHostGroupAttributeResponseBody body;

    public static ModifyDedicatedHostGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostGroupAttributeResponse self = new ModifyDedicatedHostGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDedicatedHostGroupAttributeResponse setBody(ModifyDedicatedHostGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDedicatedHostGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
