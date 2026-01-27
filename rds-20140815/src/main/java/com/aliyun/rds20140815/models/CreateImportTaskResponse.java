// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateImportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImportTaskResponseBody body;

    public static CreateImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImportTaskResponse self = new CreateImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateImportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImportTaskResponse setBody(CreateImportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImportTaskResponseBody getBody() {
        return this.body;
    }

}
