// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyHaVipAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHaVipAttributeResponseBody body;

    public static ModifyHaVipAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHaVipAttributeResponse self = new ModifyHaVipAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHaVipAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHaVipAttributeResponse setBody(ModifyHaVipAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHaVipAttributeResponseBody getBody() {
        return this.body;
    }

}
