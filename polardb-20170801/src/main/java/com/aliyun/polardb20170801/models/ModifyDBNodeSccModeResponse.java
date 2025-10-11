// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeSccModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBNodeSccModeResponseBody body;

    public static ModifyDBNodeSccModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeSccModeResponse self = new ModifyDBNodeSccModeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeSccModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBNodeSccModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBNodeSccModeResponse setBody(ModifyDBNodeSccModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBNodeSccModeResponseBody getBody() {
        return this.body;
    }

}
