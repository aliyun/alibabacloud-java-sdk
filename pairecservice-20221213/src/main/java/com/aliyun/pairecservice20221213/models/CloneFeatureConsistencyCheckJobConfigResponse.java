// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneFeatureConsistencyCheckJobConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneFeatureConsistencyCheckJobConfigResponseBody body;

    public static CloneFeatureConsistencyCheckJobConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneFeatureConsistencyCheckJobConfigResponse self = new CloneFeatureConsistencyCheckJobConfigResponse();
        return TeaModel.build(map, self);
    }

    public CloneFeatureConsistencyCheckJobConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneFeatureConsistencyCheckJobConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneFeatureConsistencyCheckJobConfigResponse setBody(CloneFeatureConsistencyCheckJobConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneFeatureConsistencyCheckJobConfigResponseBody getBody() {
        return this.body;
    }

}
