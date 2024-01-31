// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopMPUTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopMPUTaskResponseBody body;

    public static StopMPUTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopMPUTaskResponse self = new StopMPUTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopMPUTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopMPUTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopMPUTaskResponse setBody(StopMPUTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopMPUTaskResponseBody getBody() {
        return this.body;
    }

}
