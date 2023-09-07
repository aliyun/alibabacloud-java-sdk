// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterStorageSpaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterStorageSpaceResponseBody body;

    public static ModifyDBClusterStorageSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterStorageSpaceResponse self = new ModifyDBClusterStorageSpaceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterStorageSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterStorageSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterStorageSpaceResponse setBody(ModifyDBClusterStorageSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterStorageSpaceResponseBody getBody() {
        return this.body;
    }

}
