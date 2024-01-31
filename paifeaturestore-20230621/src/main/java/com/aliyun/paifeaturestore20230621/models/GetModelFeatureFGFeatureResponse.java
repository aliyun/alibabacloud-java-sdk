// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetModelFeatureFGFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModelFeatureFGFeatureResponseBody body;

    public static GetModelFeatureFGFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelFeatureFGFeatureResponse self = new GetModelFeatureFGFeatureResponse();
        return TeaModel.build(map, self);
    }

    public GetModelFeatureFGFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelFeatureFGFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelFeatureFGFeatureResponse setBody(GetModelFeatureFGFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelFeatureFGFeatureResponseBody getBody() {
        return this.body;
    }

}
