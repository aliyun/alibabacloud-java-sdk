// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ModifyBuildpackPackagesStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBuildpackPackagesStatusResponseBody body;

    public static ModifyBuildpackPackagesStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBuildpackPackagesStatusResponse self = new ModifyBuildpackPackagesStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBuildpackPackagesStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBuildpackPackagesStatusResponse setBody(ModifyBuildpackPackagesStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBuildpackPackagesStatusResponseBody getBody() {
        return this.body;
    }

}
