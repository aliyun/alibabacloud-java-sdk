// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModelIsUsingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelIsUsingResponseBody body;

    public static ModelIsUsingResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelIsUsingResponse self = new ModelIsUsingResponse();
        return TeaModel.build(map, self);
    }

    public ModelIsUsingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelIsUsingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelIsUsingResponse setBody(ModelIsUsingResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelIsUsingResponseBody getBody() {
        return this.body;
    }

}
