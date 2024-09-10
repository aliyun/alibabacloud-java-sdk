// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateJenkinsImageScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateJenkinsImageScanTaskResponseBody body;

    public static CreateJenkinsImageScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateJenkinsImageScanTaskResponse self = new CreateJenkinsImageScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateJenkinsImageScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateJenkinsImageScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateJenkinsImageScanTaskResponse setBody(CreateJenkinsImageScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateJenkinsImageScanTaskResponseBody getBody() {
        return this.body;
    }

}
