// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppLayoutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppLayoutResponseBody body;

    public static CreateAppLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppLayoutResponse self = new CreateAppLayoutResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppLayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppLayoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppLayoutResponse setBody(CreateAppLayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppLayoutResponseBody getBody() {
        return this.body;
    }

}
