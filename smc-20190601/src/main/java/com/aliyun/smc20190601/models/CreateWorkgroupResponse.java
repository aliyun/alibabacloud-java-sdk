// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CreateWorkgroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkgroupResponseBody body;

    public static CreateWorkgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkgroupResponse self = new CreateWorkgroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkgroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkgroupResponse setBody(CreateWorkgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkgroupResponseBody getBody() {
        return this.body;
    }

}
