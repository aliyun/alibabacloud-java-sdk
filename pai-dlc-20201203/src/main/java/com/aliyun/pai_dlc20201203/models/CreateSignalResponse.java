// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateSignalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSignalResponseBody body;

    public static CreateSignalResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSignalResponse self = new CreateSignalResponse();
        return TeaModel.build(map, self);
    }

    public CreateSignalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSignalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSignalResponse setBody(CreateSignalResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSignalResponseBody getBody() {
        return this.body;
    }

}
