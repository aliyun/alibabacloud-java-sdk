// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class GetInstanceFeatureGateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceFeatureGateResponseBody body;

    public static GetInstanceFeatureGateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceFeatureGateResponse self = new GetInstanceFeatureGateResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceFeatureGateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceFeatureGateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceFeatureGateResponse setBody(GetInstanceFeatureGateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceFeatureGateResponseBody getBody() {
        return this.body;
    }

}
