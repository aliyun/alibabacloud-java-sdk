// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunEssayCorrectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunEssayCorrectionResponseBody body;

    public static RunEssayCorrectionResponse build(java.util.Map<String, ?> map) throws Exception {
        RunEssayCorrectionResponse self = new RunEssayCorrectionResponse();
        return TeaModel.build(map, self);
    }

    public RunEssayCorrectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunEssayCorrectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunEssayCorrectionResponse setBody(RunEssayCorrectionResponseBody body) {
        this.body = body;
        return this;
    }
    public RunEssayCorrectionResponseBody getBody() {
        return this.body;
    }

}
