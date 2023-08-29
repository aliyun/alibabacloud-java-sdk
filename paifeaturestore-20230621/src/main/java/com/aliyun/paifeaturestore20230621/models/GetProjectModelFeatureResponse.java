// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetProjectModelFeatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProjectModelFeatureResponseBody body;

    public static GetProjectModelFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectModelFeatureResponse self = new GetProjectModelFeatureResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectModelFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectModelFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectModelFeatureResponse setBody(GetProjectModelFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectModelFeatureResponseBody getBody() {
        return this.body;
    }

}
