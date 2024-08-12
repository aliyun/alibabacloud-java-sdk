// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class CreateAppOtaVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppOtaVersionResponseBody body;

    public static CreateAppOtaVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppOtaVersionResponse self = new CreateAppOtaVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppOtaVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppOtaVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppOtaVersionResponse setBody(CreateAppOtaVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppOtaVersionResponseBody getBody() {
        return this.body;
    }

}
