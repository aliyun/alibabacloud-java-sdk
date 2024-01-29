// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateFeatureEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFeatureEntityResponseBody body;

    public static CreateFeatureEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFeatureEntityResponse self = new CreateFeatureEntityResponse();
        return TeaModel.build(map, self);
    }

    public CreateFeatureEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFeatureEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFeatureEntityResponse setBody(CreateFeatureEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFeatureEntityResponseBody getBody() {
        return this.body;
    }

}
