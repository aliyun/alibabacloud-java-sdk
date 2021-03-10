// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CreateExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateExportTaskResponseBody body;

    public static CreateExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExportTaskResponse self = new CreateExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExportTaskResponse setBody(CreateExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExportTaskResponseBody getBody() {
        return this.body;
    }

}
