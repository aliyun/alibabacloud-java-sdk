// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConfigResponseBody body;

    public static CreateConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigResponse self = new CreateConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConfigResponse setBody(CreateConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConfigResponseBody getBody() {
        return this.body;
    }

}
