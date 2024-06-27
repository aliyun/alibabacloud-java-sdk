// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyCustVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCustVariableResponseBody body;

    public static ModifyCustVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustVariableResponse self = new ModifyCustVariableResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCustVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCustVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCustVariableResponse setBody(ModifyCustVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCustVariableResponseBody getBody() {
        return this.body;
    }

}
