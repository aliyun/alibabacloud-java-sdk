// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class GetNodeGroupFeatureGateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNodeGroupFeatureGateResponseBody body;

    public static GetNodeGroupFeatureGateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeGroupFeatureGateResponse self = new GetNodeGroupFeatureGateResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeGroupFeatureGateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeGroupFeatureGateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNodeGroupFeatureGateResponse setBody(GetNodeGroupFeatureGateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeGroupFeatureGateResponseBody getBody() {
        return this.body;
    }

}
