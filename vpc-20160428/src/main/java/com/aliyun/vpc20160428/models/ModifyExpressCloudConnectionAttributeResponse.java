// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressCloudConnectionAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyExpressCloudConnectionAttributeResponseBody body;

    public static ModifyExpressCloudConnectionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressCloudConnectionAttributeResponse self = new ModifyExpressCloudConnectionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyExpressCloudConnectionAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyExpressCloudConnectionAttributeResponse setBody(ModifyExpressCloudConnectionAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyExpressCloudConnectionAttributeResponseBody getBody() {
        return this.body;
    }

}
