// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateDriveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDriveResponseBody body;

    public static CreateDriveResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDriveResponse self = new CreateDriveResponse();
        return TeaModel.build(map, self);
    }

    public CreateDriveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDriveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDriveResponse setBody(CreateDriveResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDriveResponseBody getBody() {
        return this.body;
    }

}
