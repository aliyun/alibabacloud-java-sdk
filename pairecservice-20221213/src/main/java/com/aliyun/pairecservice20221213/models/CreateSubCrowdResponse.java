// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateSubCrowdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSubCrowdResponseBody body;

    public static CreateSubCrowdResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubCrowdResponse self = new CreateSubCrowdResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubCrowdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubCrowdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSubCrowdResponse setBody(CreateSubCrowdResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubCrowdResponseBody getBody() {
        return this.body;
    }

}
