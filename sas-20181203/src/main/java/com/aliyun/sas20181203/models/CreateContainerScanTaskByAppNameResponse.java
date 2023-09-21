// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateContainerScanTaskByAppNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateContainerScanTaskByAppNameResponseBody body;

    public static CreateContainerScanTaskByAppNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerScanTaskByAppNameResponse self = new CreateContainerScanTaskByAppNameResponse();
        return TeaModel.build(map, self);
    }

    public CreateContainerScanTaskByAppNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContainerScanTaskByAppNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContainerScanTaskByAppNameResponse setBody(CreateContainerScanTaskByAppNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContainerScanTaskByAppNameResponseBody getBody() {
        return this.body;
    }

}
