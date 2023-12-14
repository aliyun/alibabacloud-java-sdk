// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ModifyStorageBundleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyStorageBundleResponseBody body;

    public static ModifyStorageBundleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageBundleResponse self = new ModifyStorageBundleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStorageBundleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStorageBundleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyStorageBundleResponse setBody(ModifyStorageBundleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStorageBundleResponseBody getBody() {
        return this.body;
    }

}
