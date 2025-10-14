// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RestartDataImportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartDataImportTaskResponseBody body;

    public static RestartDataImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartDataImportTaskResponse self = new RestartDataImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public RestartDataImportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartDataImportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartDataImportTaskResponse setBody(RestartDataImportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartDataImportTaskResponseBody getBody() {
        return this.body;
    }

}
