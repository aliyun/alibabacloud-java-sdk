// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingDataPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRenderingDataPackageResponseBody body;

    public static CreateRenderingDataPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRenderingDataPackageResponse self = new CreateRenderingDataPackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateRenderingDataPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRenderingDataPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRenderingDataPackageResponse setBody(CreateRenderingDataPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRenderingDataPackageResponseBody getBody() {
        return this.body;
    }

}
