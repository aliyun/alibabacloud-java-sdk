// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddCustomLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCustomLineResponseBody body;

    public static AddCustomLineResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCustomLineResponse self = new AddCustomLineResponse();
        return TeaModel.build(map, self);
    }

    public AddCustomLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCustomLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCustomLineResponse setBody(AddCustomLineResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCustomLineResponseBody getBody() {
        return this.body;
    }

}
