// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StopJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopJobResponseBody body;

    public static StopJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StopJobResponse self = new StopJobResponse();
        return TeaModel.build(map, self);
    }

    public StopJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopJobResponse setBody(StopJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopJobResponseBody getBody() {
        return this.body;
    }

}
