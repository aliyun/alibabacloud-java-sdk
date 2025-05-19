// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CheckModelFeatureFGFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckModelFeatureFGFeatureResponseBody body;

    public static CheckModelFeatureFGFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckModelFeatureFGFeatureResponse self = new CheckModelFeatureFGFeatureResponse();
        return TeaModel.build(map, self);
    }

    public CheckModelFeatureFGFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckModelFeatureFGFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckModelFeatureFGFeatureResponse setBody(CheckModelFeatureFGFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckModelFeatureFGFeatureResponseBody getBody() {
        return this.body;
    }

}
