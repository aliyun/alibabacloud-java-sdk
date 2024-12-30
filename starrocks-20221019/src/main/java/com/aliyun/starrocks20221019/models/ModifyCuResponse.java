// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyCuResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCuResponseBody body;

    public static ModifyCuResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCuResponse self = new ModifyCuResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCuResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCuResponse setBody(ModifyCuResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCuResponseBody getBody() {
        return this.body;
    }

}
