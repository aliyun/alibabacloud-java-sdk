// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class DeleteExecutorGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExecutorGroupResponseBody body;

    public static DeleteExecutorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExecutorGroupResponse self = new DeleteExecutorGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExecutorGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExecutorGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExecutorGroupResponse setBody(DeleteExecutorGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExecutorGroupResponseBody getBody() {
        return this.body;
    }

}
