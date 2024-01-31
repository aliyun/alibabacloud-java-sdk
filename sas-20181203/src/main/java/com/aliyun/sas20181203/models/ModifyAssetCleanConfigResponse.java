// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAssetCleanConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAssetCleanConfigResponseBody body;

    public static ModifyAssetCleanConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAssetCleanConfigResponse self = new ModifyAssetCleanConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAssetCleanConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAssetCleanConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAssetCleanConfigResponse setBody(ModifyAssetCleanConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAssetCleanConfigResponseBody getBody() {
        return this.body;
    }

}
