// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartMPUTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public StartMPUTaskResponse setBody(StartMPUTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartMPUTaskResponseBody getBody() {
        return this.body;
    }

}
