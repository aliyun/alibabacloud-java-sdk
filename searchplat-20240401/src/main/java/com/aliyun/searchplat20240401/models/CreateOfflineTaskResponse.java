// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateOfflineTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOfflineTaskResponseBody body;

    public static CreateOfflineTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOfflineTaskResponse self = new CreateOfflineTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateOfflineTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOfflineTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOfflineTaskResponse setBody(CreateOfflineTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOfflineTaskResponseBody getBody() {
        return this.body;
    }

}
