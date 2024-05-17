// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class StopInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopInstanceResponseBody body;

    public static StopInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceResponse self = new StopInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopInstanceResponse setBody(StopInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopInstanceResponseBody getBody() {
        return this.body;
    }

}
