// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDasInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDasInstanceConfigResponseBody body;

    public static ModifyDasInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDasInstanceConfigResponse self = new ModifyDasInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDasInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDasInstanceConfigResponse setBody(ModifyDasInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDasInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
