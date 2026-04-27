// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateExecutorGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExecutorGroupResponseBody body;

    public static UpdateExecutorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExecutorGroupResponse self = new UpdateExecutorGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExecutorGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExecutorGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExecutorGroupResponse setBody(UpdateExecutorGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExecutorGroupResponseBody getBody() {
        return this.body;
    }

}
