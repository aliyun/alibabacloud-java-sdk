// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetFeatureConsistencyCheckJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFeatureConsistencyCheckJobResponseBody body;

    public static GetFeatureConsistencyCheckJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureConsistencyCheckJobResponse self = new GetFeatureConsistencyCheckJobResponse();
        return TeaModel.build(map, self);
    }

    public GetFeatureConsistencyCheckJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFeatureConsistencyCheckJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFeatureConsistencyCheckJobResponse setBody(GetFeatureConsistencyCheckJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFeatureConsistencyCheckJobResponseBody getBody() {
        return this.body;
    }

}
