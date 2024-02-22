// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateFeatureConsistencyCheckJobConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
