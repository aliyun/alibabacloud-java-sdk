// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class RunInstanceInspectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunInstanceInspectionResponseBody body;

    public static RunInstanceInspectionResponse build(java.util.Map<String, ?> map) throws Exception {
        RunInstanceInspectionResponse self = new RunInstanceInspectionResponse();
        return TeaModel.build(map, self);
    }

    public RunInstanceInspectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunInstanceInspectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunInstanceInspectionResponse setBody(RunInstanceInspectionResponseBody body) {
        this.body = body;
        return this;
    }
    public RunInstanceInspectionResponseBody getBody() {
        return this.body;
    }

}
