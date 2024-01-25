// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class SaveEnvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveEnvResponseBody body;

    public static SaveEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveEnvResponse self = new SaveEnvResponse();
        return TeaModel.build(map, self);
    }

    public SaveEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveEnvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveEnvResponse setBody(SaveEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveEnvResponseBody getBody() {
        return this.body;
    }

}
