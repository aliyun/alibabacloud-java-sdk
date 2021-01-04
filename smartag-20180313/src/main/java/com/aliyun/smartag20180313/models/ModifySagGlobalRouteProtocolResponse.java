// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagGlobalRouteProtocolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySagGlobalRouteProtocolResponseBody body;

    public static ModifySagGlobalRouteProtocolResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagGlobalRouteProtocolResponse self = new ModifySagGlobalRouteProtocolResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagGlobalRouteProtocolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagGlobalRouteProtocolResponse setBody(ModifySagGlobalRouteProtocolResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagGlobalRouteProtocolResponseBody getBody() {
        return this.body;
    }

}
