// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddLabelsResponseBody body;

    public static AddLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLabelsResponse self = new AddLabelsResponse();
        return TeaModel.build(map, self);
    }

    public AddLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLabelsResponse setBody(AddLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLabelsResponseBody getBody() {
        return this.body;
    }

}
