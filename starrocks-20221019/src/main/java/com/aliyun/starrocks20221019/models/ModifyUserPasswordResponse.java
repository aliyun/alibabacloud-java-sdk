// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserPasswordResponseBody body;

    public static ModifyUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserPasswordResponse self = new ModifyUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserPasswordResponse setBody(ModifyUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserPasswordResponseBody getBody() {
        return this.body;
    }

}
