// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFeatureResponseBody body;

    public static CreateFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFeatureResponse self = new CreateFeatureResponse();
        return TeaModel.build(map, self);
    }

    public CreateFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFeatureResponse setBody(CreateFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFeatureResponseBody getBody() {
        return this.body;
    }

}
