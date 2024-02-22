// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetFeatureConsistencyCheckJobConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFeatureConsistencyCheckJobConfigResponseBody body;

    public static GetFeatureConsistencyCheckJobConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureConsistencyCheckJobConfigResponse self = new GetFeatureConsistencyCheckJobConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetFeatureConsistencyCheckJobConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFeatureConsistencyCheckJobConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFeatureConsistencyCheckJobConfigResponse setBody(GetFeatureConsistencyCheckJobConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFeatureConsistencyCheckJobConfigResponseBody getBody() {
        return this.body;
    }

}
