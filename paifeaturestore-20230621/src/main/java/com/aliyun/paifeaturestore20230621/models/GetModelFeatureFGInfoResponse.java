// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetModelFeatureFGInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModelFeatureFGInfoResponseBody body;

    public static GetModelFeatureFGInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelFeatureFGInfoResponse self = new GetModelFeatureFGInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetModelFeatureFGInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelFeatureFGInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelFeatureFGInfoResponse setBody(GetModelFeatureFGInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelFeatureFGInfoResponseBody getBody() {
        return this.body;
    }

}
