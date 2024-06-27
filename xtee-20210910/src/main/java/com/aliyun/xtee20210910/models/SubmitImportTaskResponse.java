// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SubmitImportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitImportTaskResponseBody body;

    public static SubmitImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitImportTaskResponse self = new SubmitImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitImportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitImportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitImportTaskResponse setBody(SubmitImportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitImportTaskResponseBody getBody() {
        return this.body;
    }

}
