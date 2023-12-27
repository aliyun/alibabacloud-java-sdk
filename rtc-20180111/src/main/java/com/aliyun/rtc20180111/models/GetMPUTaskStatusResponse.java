// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class GetMPUTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMPUTaskStatusResponseBody body;

    public static GetMPUTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMPUTaskStatusResponse self = new GetMPUTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetMPUTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMPUTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMPUTaskStatusResponse setBody(GetMPUTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMPUTaskStatusResponseBody getBody() {
        return this.body;
    }

}
