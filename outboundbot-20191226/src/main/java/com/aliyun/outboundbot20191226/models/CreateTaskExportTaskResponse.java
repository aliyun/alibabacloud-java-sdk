// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateTaskExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTaskExportTaskResponseBody body;

    public static CreateTaskExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskExportTaskResponse self = new CreateTaskExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateTaskExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTaskExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTaskExportTaskResponse setBody(CreateTaskExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTaskExportTaskResponseBody getBody() {
        return this.body;
    }

}
