// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyRouteEntryResponseBody body;

    public static ModifyRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteEntryResponse self = new ModifyRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRouteEntryResponse setBody(ModifyRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRouteEntryResponseBody getBody() {
        return this.body;
    }

}
