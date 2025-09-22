// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceStorageConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceStorageConfigResponseBody body;

    public static ModifyInstanceStorageConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceStorageConfigResponse self = new ModifyInstanceStorageConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceStorageConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceStorageConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceStorageConfigResponse setBody(ModifyInstanceStorageConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceStorageConfigResponseBody getBody() {
        return this.body;
    }

}
