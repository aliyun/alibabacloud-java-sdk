// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartMPUTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartMPUTaskResponseBody body;

    public static StartMPUTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMPUTaskResponse self = new StartMPUTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartMPUTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartMPUTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartMPUTaskResponse setBody(StartMPUTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartMPUTaskResponseBody getBody() {
        return this.body;
    }

}
