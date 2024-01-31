// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddTagWithUuidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTagWithUuidResponseBody body;

    public static AddTagWithUuidResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTagWithUuidResponse self = new AddTagWithUuidResponse();
        return TeaModel.build(map, self);
    }

    public AddTagWithUuidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTagWithUuidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTagWithUuidResponse setBody(AddTagWithUuidResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTagWithUuidResponseBody getBody() {
        return this.body;
    }

}
