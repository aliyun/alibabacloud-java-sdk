// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class RestartNodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartNodeGroupResponseBody body;

    public static RestartNodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartNodeGroupResponse self = new RestartNodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public RestartNodeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartNodeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartNodeGroupResponse setBody(RestartNodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartNodeGroupResponseBody getBody() {
        return this.body;
    }

}
