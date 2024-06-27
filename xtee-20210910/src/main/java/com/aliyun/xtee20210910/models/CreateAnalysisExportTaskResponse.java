// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateAnalysisExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAnalysisExportTaskResponseBody body;

    public static CreateAnalysisExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAnalysisExportTaskResponse self = new CreateAnalysisExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateAnalysisExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAnalysisExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAnalysisExportTaskResponse setBody(CreateAnalysisExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAnalysisExportTaskResponseBody getBody() {
        return this.body;
    }

}
