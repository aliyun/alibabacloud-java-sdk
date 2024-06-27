// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateReplenishTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateReplenishTaskResponseBody body;

    public static CreateReplenishTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReplenishTaskResponse self = new CreateReplenishTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateReplenishTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReplenishTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReplenishTaskResponse setBody(CreateReplenishTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReplenishTaskResponseBody getBody() {
        return this.body;
    }

}
