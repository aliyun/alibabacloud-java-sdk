// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyRouterInterfaceAttributeResponseBody body;

    public static ModifyRouterInterfaceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouterInterfaceAttributeResponse self = new ModifyRouterInterfaceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRouterInterfaceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRouterInterfaceAttributeResponse setBody(ModifyRouterInterfaceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRouterInterfaceAttributeResponseBody getBody() {
        return this.body;
    }

}
