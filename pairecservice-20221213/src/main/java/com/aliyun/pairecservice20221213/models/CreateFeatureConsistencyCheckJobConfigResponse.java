// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateFeatureConsistencyCheckJobConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFeatureConsistencyCheckJobConfigResponseBody body;

    public static CreateFeatureConsistencyCheckJobConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFeatureConsistencyCheckJobConfigResponse self = new CreateFeatureConsistencyCheckJobConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateFeatureConsistencyCheckJobConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFeatureConsistencyCheckJobConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFeatureConsistencyCheckJobConfigResponse setBody(CreateFeatureConsistencyCheckJobConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFeatureConsistencyCheckJobConfigResponseBody getBody() {
        return this.body;
    }

}
