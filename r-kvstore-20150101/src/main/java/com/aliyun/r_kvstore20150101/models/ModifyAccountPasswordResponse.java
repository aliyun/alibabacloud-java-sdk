// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyAccountPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccountPasswordResponseBody body;

    public static ModifyAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPasswordResponse self = new ModifyAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccountPasswordResponse setBody(ModifyAccountPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountPasswordResponseBody getBody() {
        return this.body;
    }

}
