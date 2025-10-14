// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteEvaluateAndImportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEvaluateAndImportTaskResponseBody body;

    public static DeleteEvaluateAndImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEvaluateAndImportTaskResponse self = new DeleteEvaluateAndImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEvaluateAndImportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEvaluateAndImportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEvaluateAndImportTaskResponse setBody(DeleteEvaluateAndImportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEvaluateAndImportTaskResponseBody getBody() {
        return this.body;
    }

}
