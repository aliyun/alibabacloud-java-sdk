// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class StopDataImportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDataImportTaskResponseBody body;

    public static StopDataImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDataImportTaskResponse self = new StopDataImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopDataImportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDataImportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDataImportTaskResponse setBody(StopDataImportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDataImportTaskResponseBody getBody() {
        return this.body;
    }

}
