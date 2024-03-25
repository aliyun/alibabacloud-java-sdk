// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyEventTypeStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEventTypeStatusResponseBody body;

    public static ModifyEventTypeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventTypeStatusResponse self = new ModifyEventTypeStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEventTypeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEventTypeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEventTypeStatusResponse setBody(ModifyEventTypeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEventTypeStatusResponseBody getBody() {
        return this.body;
    }

}
