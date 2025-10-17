// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBDescriptionZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBDescriptionZonalResponseBody body;

    public static ModifyDBDescriptionZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBDescriptionZonalResponse self = new ModifyDBDescriptionZonalResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBDescriptionZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBDescriptionZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBDescriptionZonalResponse setBody(ModifyDBDescriptionZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBDescriptionZonalResponseBody getBody() {
        return this.body;
    }

}
