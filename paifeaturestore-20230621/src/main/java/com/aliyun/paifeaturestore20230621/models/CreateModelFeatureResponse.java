// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateModelFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModelFeatureResponseBody body;

    public static CreateModelFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelFeatureResponse self = new CreateModelFeatureResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelFeatureResponse setBody(CreateModelFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelFeatureResponseBody getBody() {
        return this.body;
    }

}
