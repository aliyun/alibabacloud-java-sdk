// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartVirusScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartVirusScanTaskResponseBody body;

    public static StartVirusScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartVirusScanTaskResponse self = new StartVirusScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartVirusScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartVirusScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartVirusScanTaskResponse setBody(StartVirusScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartVirusScanTaskResponseBody getBody() {
        return this.body;
    }

}
