// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ActivateRouterInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActivateRouterInterfaceResponseBody body;

    public static ActivateRouterInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateRouterInterfaceResponse self = new ActivateRouterInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public ActivateRouterInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateRouterInterfaceResponse setBody(ActivateRouterInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateRouterInterfaceResponseBody getBody() {
        return this.body;
    }

}
