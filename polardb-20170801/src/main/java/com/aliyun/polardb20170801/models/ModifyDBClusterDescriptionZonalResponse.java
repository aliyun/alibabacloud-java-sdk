// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterDescriptionZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterDescriptionZonalResponseBody body;

    public static ModifyDBClusterDescriptionZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterDescriptionZonalResponse self = new ModifyDBClusterDescriptionZonalResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterDescriptionZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterDescriptionZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterDescriptionZonalResponse setBody(ModifyDBClusterDescriptionZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterDescriptionZonalResponseBody getBody() {
        return this.body;
    }

}
