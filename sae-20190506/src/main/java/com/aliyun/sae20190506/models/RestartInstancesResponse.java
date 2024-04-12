// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RestartInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartInstancesResponseBody body;

    public static RestartInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartInstancesResponse self = new RestartInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RestartInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartInstancesResponse setBody(RestartInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartInstancesResponseBody getBody() {
        return this.body;
    }

}
