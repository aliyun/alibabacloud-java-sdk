// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagRouteProtocolOspfResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySagRouteProtocolOspfResponseBody body;

    public static ModifySagRouteProtocolOspfResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagRouteProtocolOspfResponse self = new ModifySagRouteProtocolOspfResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagRouteProtocolOspfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagRouteProtocolOspfResponse setBody(ModifySagRouteProtocolOspfResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagRouteProtocolOspfResponseBody getBody() {
        return this.body;
    }

}
