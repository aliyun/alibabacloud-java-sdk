// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class StopInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopInstancesResponseBody body;

    public static StopInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        StopInstancesResponse self = new StopInstancesResponse();
        return TeaModel.build(map, self);
    }

    public StopInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopInstancesResponse setBody(StopInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public StopInstancesResponseBody getBody() {
        return this.body;
    }

}
