// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateScheduledTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateScheduledTaskResponseBody body;

    public static UpdateScheduledTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduledTaskResponse self = new UpdateScheduledTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScheduledTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScheduledTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateScheduledTaskResponse setBody(UpdateScheduledTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScheduledTaskResponseBody getBody() {
        return this.body;
    }

}
