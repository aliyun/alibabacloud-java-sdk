// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetModelFeatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetModelFeatureResponseBody body;

    public static GetModelFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelFeatureResponse self = new GetModelFeatureResponse();
        return TeaModel.build(map, self);
    }

    public GetModelFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelFeatureResponse setBody(GetModelFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelFeatureResponseBody getBody() {
        return this.body;
    }

}
