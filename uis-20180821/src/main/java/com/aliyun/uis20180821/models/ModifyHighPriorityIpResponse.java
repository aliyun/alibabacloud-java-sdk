// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifyHighPriorityIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHighPriorityIpResponseBody body;

    public static ModifyHighPriorityIpResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHighPriorityIpResponse self = new ModifyHighPriorityIpResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHighPriorityIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHighPriorityIpResponse setBody(ModifyHighPriorityIpResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHighPriorityIpResponseBody getBody() {
        return this.body;
    }

}
