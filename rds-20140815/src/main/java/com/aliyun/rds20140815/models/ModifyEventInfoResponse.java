// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyEventInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEventInfoResponseBody body;

    public static ModifyEventInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventInfoResponse self = new ModifyEventInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEventInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEventInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEventInfoResponse setBody(ModifyEventInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEventInfoResponseBody getBody() {
        return this.body;
    }

}
