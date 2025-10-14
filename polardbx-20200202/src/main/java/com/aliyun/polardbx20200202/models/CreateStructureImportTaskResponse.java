// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateStructureImportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStructureImportTaskResponseBody body;

    public static CreateStructureImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStructureImportTaskResponse self = new CreateStructureImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateStructureImportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStructureImportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStructureImportTaskResponse setBody(CreateStructureImportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStructureImportTaskResponseBody getBody() {
        return this.body;
    }

}
