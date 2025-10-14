// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateDataImportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataImportTaskResponseBody body;

    public static CreateDataImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataImportTaskResponse self = new CreateDataImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataImportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataImportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataImportTaskResponse setBody(CreateDataImportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataImportTaskResponseBody getBody() {
        return this.body;
    }

}
