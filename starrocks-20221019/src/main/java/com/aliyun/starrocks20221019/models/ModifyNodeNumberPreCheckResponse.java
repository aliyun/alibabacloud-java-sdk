// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyNodeNumberPreCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyNodeNumberPreCheckResponseBody body;

    public static ModifyNodeNumberPreCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeNumberPreCheckResponse self = new ModifyNodeNumberPreCheckResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNodeNumberPreCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNodeNumberPreCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNodeNumberPreCheckResponse setBody(ModifyNodeNumberPreCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNodeNumberPreCheckResponseBody getBody() {
        return this.body;
    }

}
