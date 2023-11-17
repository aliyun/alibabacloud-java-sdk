// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyComponentAssetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyComponentAssetResponseBody body;

    public static ModifyComponentAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyComponentAssetResponse self = new ModifyComponentAssetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyComponentAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyComponentAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyComponentAssetResponse setBody(ModifyComponentAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyComponentAssetResponseBody getBody() {
        return this.body;
    }

}
