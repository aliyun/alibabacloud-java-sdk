// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_verify_agent20240131.models;

import com.aliyun.tea.*;

public class CreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateResponseBody body;

    public static CreateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResponse self = new CreateResponse();
        return TeaModel.build(map, self);
    }

    public CreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResponse setBody(CreateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResponseBody getBody() {
        return this.body;
    }

}
