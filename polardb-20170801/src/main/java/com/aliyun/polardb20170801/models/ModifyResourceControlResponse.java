// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyResourceControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyResourceControlResponseBody body;

    public static ModifyResourceControlResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceControlResponse self = new ModifyResourceControlResponse();
        return TeaModel.build(map, self);
    }

    public ModifyResourceControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyResourceControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyResourceControlResponse setBody(ModifyResourceControlResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyResourceControlResponseBody getBody() {
        return this.body;
    }

}
