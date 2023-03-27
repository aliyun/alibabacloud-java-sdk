// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyActiveOperationTasksResponseBody body;

    public static ModifyActiveOperationTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationTasksResponse self = new ModifyActiveOperationTasksResponse();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyActiveOperationTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyActiveOperationTasksResponse setBody(ModifyActiveOperationTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyActiveOperationTasksResponseBody getBody() {
        return this.body;
    }

}
