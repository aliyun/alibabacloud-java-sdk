// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateJobGroupExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateJobGroupExportTaskResponseBody body;

    public static CreateJobGroupExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateJobGroupExportTaskResponse self = new CreateJobGroupExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateJobGroupExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateJobGroupExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateJobGroupExportTaskResponse setBody(CreateJobGroupExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateJobGroupExportTaskResponseBody getBody() {
        return this.body;
    }

}
