// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateContainerScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateContainerScanTaskResponseBody body;

    public static CreateContainerScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerScanTaskResponse self = new CreateContainerScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateContainerScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContainerScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContainerScanTaskResponse setBody(CreateContainerScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContainerScanTaskResponseBody getBody() {
        return this.body;
    }

}
