// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddMosaicsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMosaicsResponseBody body;

    public static AddMosaicsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMosaicsResponse self = new AddMosaicsResponse();
        return TeaModel.build(map, self);
    }

    public AddMosaicsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMosaicsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMosaicsResponse setBody(AddMosaicsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMosaicsResponseBody getBody() {
        return this.body;
    }

}
