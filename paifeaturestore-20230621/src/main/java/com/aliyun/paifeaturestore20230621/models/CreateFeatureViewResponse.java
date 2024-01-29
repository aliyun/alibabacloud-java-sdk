// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateFeatureViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFeatureViewResponseBody body;

    public static CreateFeatureViewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFeatureViewResponse self = new CreateFeatureViewResponse();
        return TeaModel.build(map, self);
    }

    public CreateFeatureViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFeatureViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFeatureViewResponse setBody(CreateFeatureViewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFeatureViewResponseBody getBody() {
        return this.body;
    }

}
