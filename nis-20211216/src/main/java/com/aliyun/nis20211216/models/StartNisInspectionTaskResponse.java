// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class StartNisInspectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartNisInspectionTaskResponseBody body;

    public static StartNisInspectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartNisInspectionTaskResponse self = new StartNisInspectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartNisInspectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartNisInspectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartNisInspectionTaskResponse setBody(StartNisInspectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartNisInspectionTaskResponseBody getBody() {
        return this.body;
    }

}
