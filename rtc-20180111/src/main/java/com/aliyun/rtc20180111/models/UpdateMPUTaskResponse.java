// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateMPUTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMPUTaskResponseBody body;

    public static UpdateMPUTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMPUTaskResponse self = new UpdateMPUTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMPUTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMPUTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMPUTaskResponse setBody(UpdateMPUTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMPUTaskResponseBody getBody() {
        return this.body;
    }

}
