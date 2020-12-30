// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouteTableAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyRouteTableAttributesResponseBody body;

    public static ModifyRouteTableAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteTableAttributesResponse self = new ModifyRouteTableAttributesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRouteTableAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRouteTableAttributesResponse setBody(ModifyRouteTableAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRouteTableAttributesResponseBody getBody() {
        return this.body;
    }

}
