// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class UpdateJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateJobResponseBody body;

    public static UpdateJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobResponse self = new UpdateJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateJobResponse setBody(UpdateJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateJobResponseBody getBody() {
        return this.body;
    }

}
