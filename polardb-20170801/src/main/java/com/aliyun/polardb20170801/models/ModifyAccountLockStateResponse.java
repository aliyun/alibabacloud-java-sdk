// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAccountLockStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccountLockStateResponseBody body;

    public static ModifyAccountLockStateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountLockStateResponse self = new ModifyAccountLockStateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountLockStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountLockStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccountLockStateResponse setBody(ModifyAccountLockStateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountLockStateResponseBody getBody() {
        return this.body;
    }

}
