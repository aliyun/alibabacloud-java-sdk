// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVariableResponseBody body;

    public static ModifyVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVariableResponse self = new ModifyVariableResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVariableResponse setBody(ModifyVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVariableResponseBody getBody() {
        return this.body;
    }

}
