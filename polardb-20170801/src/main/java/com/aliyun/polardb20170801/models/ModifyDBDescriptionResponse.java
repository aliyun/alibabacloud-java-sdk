// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBDescriptionResponseBody body;

    public static ModifyDBDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBDescriptionResponse self = new ModifyDBDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBDescriptionResponse setBody(ModifyDBDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBDescriptionResponseBody getBody() {
        return this.body;
    }

}
