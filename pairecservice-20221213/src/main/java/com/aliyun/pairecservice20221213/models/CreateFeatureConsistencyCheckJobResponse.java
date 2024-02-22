// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateFeatureConsistencyCheckJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFeatureConsistencyCheckJobResponseBody body;

    public static CreateFeatureConsistencyCheckJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFeatureConsistencyCheckJobResponse self = new CreateFeatureConsistencyCheckJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateFeatureConsistencyCheckJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFeatureConsistencyCheckJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFeatureConsistencyCheckJobResponse setBody(CreateFeatureConsistencyCheckJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFeatureConsistencyCheckJobResponseBody getBody() {
        return this.body;
    }

}
