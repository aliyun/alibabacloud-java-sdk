// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyImageRegistryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyImageRegistryResponseBody body;

    public static ModifyImageRegistryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageRegistryResponse self = new ModifyImageRegistryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyImageRegistryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyImageRegistryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyImageRegistryResponse setBody(ModifyImageRegistryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyImageRegistryResponseBody getBody() {
        return this.body;
    }

}
