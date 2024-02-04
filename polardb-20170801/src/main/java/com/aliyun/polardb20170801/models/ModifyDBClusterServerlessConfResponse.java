// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterServerlessConfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterServerlessConfResponseBody body;

    public static ModifyDBClusterServerlessConfResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterServerlessConfResponse self = new ModifyDBClusterServerlessConfResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterServerlessConfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterServerlessConfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterServerlessConfResponse setBody(ModifyDBClusterServerlessConfResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterServerlessConfResponseBody getBody() {
        return this.body;
    }

}
