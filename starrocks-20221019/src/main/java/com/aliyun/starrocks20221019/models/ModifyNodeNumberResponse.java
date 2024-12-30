// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyNodeNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyNodeNumberResponseBody body;

    public static ModifyNodeNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeNumberResponse self = new ModifyNodeNumberResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNodeNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNodeNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNodeNumberResponse setBody(ModifyNodeNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNodeNumberResponseBody getBody() {
        return this.body;
    }

}
