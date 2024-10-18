// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CancelActiveOperationTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelActiveOperationTasksResponseBody body;

    public static CancelActiveOperationTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelActiveOperationTasksResponse self = new CancelActiveOperationTasksResponse();
        return TeaModel.build(map, self);
    }

    public CancelActiveOperationTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelActiveOperationTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelActiveOperationTasksResponse setBody(CancelActiveOperationTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelActiveOperationTasksResponseBody getBody() {
        return this.body;
    }

}
