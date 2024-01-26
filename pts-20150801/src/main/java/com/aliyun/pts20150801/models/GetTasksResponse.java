// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class GetTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTasksResponseBody body;

    public static GetTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTasksResponse self = new GetTasksResponse();
        return TeaModel.build(map, self);
    }

    public GetTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTasksResponse setBody(GetTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTasksResponseBody getBody() {
        return this.body;
    }

}
