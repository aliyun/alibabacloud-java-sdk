// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StopJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopJobsResponseBody body;

    public static StopJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        StopJobsResponse self = new StopJobsResponse();
        return TeaModel.build(map, self);
    }

    public StopJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopJobsResponse setBody(StopJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public StopJobsResponseBody getBody() {
        return this.body;
    }

}
