// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class CreateAppOtaTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppOtaTaskResponseBody body;

    public static CreateAppOtaTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppOtaTaskResponse self = new CreateAppOtaTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppOtaTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppOtaTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppOtaTaskResponse setBody(CreateAppOtaTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppOtaTaskResponseBody getBody() {
        return this.body;
    }

}
