// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddTerminalsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTerminalsResponseBody body;

    public static AddTerminalsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTerminalsResponse self = new AddTerminalsResponse();
        return TeaModel.build(map, self);
    }

    public AddTerminalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTerminalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTerminalsResponse setBody(AddTerminalsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTerminalsResponseBody getBody() {
        return this.body;
    }

}
