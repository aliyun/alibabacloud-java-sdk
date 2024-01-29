// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstanceResponseBody body;

    public static CreateInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponse self = new CreateInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceResponse setBody(CreateInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceResponseBody getBody() {
        return this.body;
    }

}
