// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEventResponseBody body;

    public static ModifyEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventResponse self = new ModifyEventResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEventResponse setBody(ModifyEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEventResponseBody getBody() {
        return this.body;
    }

}
