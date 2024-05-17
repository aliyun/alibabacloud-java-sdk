// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DisableJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableJobResponseBody body;

    public static DisableJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableJobResponse self = new DisableJobResponse();
        return TeaModel.build(map, self);
    }

    public DisableJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableJobResponse setBody(DisableJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableJobResponseBody getBody() {
        return this.body;
    }

}
