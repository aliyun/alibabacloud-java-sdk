// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRCDiskResponseBody body;

    public static CreateRCDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRCDiskResponse self = new CreateRCDiskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRCDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRCDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRCDiskResponse setBody(CreateRCDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRCDiskResponseBody getBody() {
        return this.body;
    }

}
