// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterDescriptionResponseBody body;

    public static ModifyDBClusterDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterDescriptionResponse self = new ModifyDBClusterDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterDescriptionResponse setBody(ModifyDBClusterDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterDescriptionResponseBody getBody() {
        return this.body;
    }

}
