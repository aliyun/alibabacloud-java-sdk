// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyOmsEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyOmsEndpointResponseBody body;

    public static ModifyOmsEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOmsEndpointResponse self = new ModifyOmsEndpointResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOmsEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOmsEndpointResponse setBody(ModifyOmsEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOmsEndpointResponseBody getBody() {
        return this.body;
    }

}
