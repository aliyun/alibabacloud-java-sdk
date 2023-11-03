// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateVirusScanOnceTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVirusScanOnceTaskResponseBody body;

    public static CreateVirusScanOnceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirusScanOnceTaskResponse self = new CreateVirusScanOnceTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirusScanOnceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVirusScanOnceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVirusScanOnceTaskResponse setBody(CreateVirusScanOnceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVirusScanOnceTaskResponseBody getBody() {
        return this.body;
    }

}
