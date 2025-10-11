// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyResourcePackageResponseBody body;

    public static ModifyResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourcePackageResponse self = new ModifyResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public ModifyResourcePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyResourcePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyResourcePackageResponse setBody(ModifyResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyResourcePackageResponseBody getBody() {
        return this.body;
    }

}
