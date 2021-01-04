// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class ModifyReplicationJobAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyReplicationJobAttributeResponseBody body;

    public static ModifyReplicationJobAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyReplicationJobAttributeResponse self = new ModifyReplicationJobAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyReplicationJobAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyReplicationJobAttributeResponse setBody(ModifyReplicationJobAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyReplicationJobAttributeResponseBody getBody() {
        return this.body;
    }

}
