// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCycleTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCycleTaskResponseBody body;

    public static ModifyCycleTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCycleTaskResponse self = new ModifyCycleTaskResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCycleTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCycleTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCycleTaskResponse setBody(ModifyCycleTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCycleTaskResponseBody getBody() {
        return this.body;
    }

}
