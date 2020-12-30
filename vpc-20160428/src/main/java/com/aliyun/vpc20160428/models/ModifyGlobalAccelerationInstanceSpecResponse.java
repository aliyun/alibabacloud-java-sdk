// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyGlobalAccelerationInstanceSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyGlobalAccelerationInstanceSpecResponseBody body;

    public static ModifyGlobalAccelerationInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalAccelerationInstanceSpecResponse self = new ModifyGlobalAccelerationInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalAccelerationInstanceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGlobalAccelerationInstanceSpecResponse setBody(ModifyGlobalAccelerationInstanceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGlobalAccelerationInstanceSpecResponseBody getBody() {
        return this.body;
    }

}
