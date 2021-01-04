// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagRouteProtocolBgpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySagRouteProtocolBgpResponseBody body;

    public static ModifySagRouteProtocolBgpResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagRouteProtocolBgpResponse self = new ModifySagRouteProtocolBgpResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagRouteProtocolBgpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagRouteProtocolBgpResponse setBody(ModifySagRouteProtocolBgpResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagRouteProtocolBgpResponseBody getBody() {
        return this.body;
    }

}
