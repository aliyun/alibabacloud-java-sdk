// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyComputeBurstConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyComputeBurstConfigResponseBody body;

    public static ModifyComputeBurstConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyComputeBurstConfigResponse self = new ModifyComputeBurstConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyComputeBurstConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyComputeBurstConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyComputeBurstConfigResponse setBody(ModifyComputeBurstConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyComputeBurstConfigResponseBody getBody() {
        return this.body;
    }

}
