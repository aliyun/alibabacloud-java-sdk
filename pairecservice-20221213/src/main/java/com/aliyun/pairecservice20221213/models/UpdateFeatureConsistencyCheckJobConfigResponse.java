// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateFeatureConsistencyCheckJobConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFeatureConsistencyCheckJobConfigResponseBody body;

    public static UpdateFeatureConsistencyCheckJobConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFeatureConsistencyCheckJobConfigResponse self = new UpdateFeatureConsistencyCheckJobConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFeatureConsistencyCheckJobConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFeatureConsistencyCheckJobConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFeatureConsistencyCheckJobConfigResponse setBody(UpdateFeatureConsistencyCheckJobConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFeatureConsistencyCheckJobConfigResponseBody getBody() {
        return this.body;
    }

}
