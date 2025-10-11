// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBNodeDescriptionResponseBody body;

    public static ModifyDBNodeDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeDescriptionResponse self = new ModifyDBNodeDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBNodeDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBNodeDescriptionResponse setBody(ModifyDBNodeDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBNodeDescriptionResponseBody getBody() {
        return this.body;
    }

}
