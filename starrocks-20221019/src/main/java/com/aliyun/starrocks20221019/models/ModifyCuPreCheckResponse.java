// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyCuPreCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCuPreCheckResponseBody body;

    public static ModifyCuPreCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCuPreCheckResponse self = new ModifyCuPreCheckResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCuPreCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCuPreCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCuPreCheckResponse setBody(ModifyCuPreCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCuPreCheckResponseBody getBody() {
        return this.body;
    }

}
