// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyEventStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEventStatusResponseBody body;

    public static ModifyEventStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventStatusResponse self = new ModifyEventStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEventStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEventStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEventStatusResponse setBody(ModifyEventStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEventStatusResponseBody getBody() {
        return this.body;
    }

}
