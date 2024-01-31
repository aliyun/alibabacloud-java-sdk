// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateModelFeatureFGFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModelFeatureFGFeatureResponseBody body;

    public static UpdateModelFeatureFGFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelFeatureFGFeatureResponse self = new UpdateModelFeatureFGFeatureResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelFeatureFGFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelFeatureFGFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelFeatureFGFeatureResponse setBody(UpdateModelFeatureFGFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelFeatureFGFeatureResponseBody getBody() {
        return this.body;
    }

}
