// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RemoveGlobalAccelerationInstanceIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveGlobalAccelerationInstanceIpResponseBody body;

    public static RemoveGlobalAccelerationInstanceIpResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveGlobalAccelerationInstanceIpResponse self = new RemoveGlobalAccelerationInstanceIpResponse();
        return TeaModel.build(map, self);
    }

    public RemoveGlobalAccelerationInstanceIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveGlobalAccelerationInstanceIpResponse setBody(RemoveGlobalAccelerationInstanceIpResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveGlobalAccelerationInstanceIpResponseBody getBody() {
        return this.body;
    }

}
