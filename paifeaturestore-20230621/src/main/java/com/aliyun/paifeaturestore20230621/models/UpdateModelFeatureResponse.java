// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateModelFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModelFeatureResponseBody body;

    public static UpdateModelFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelFeatureResponse self = new UpdateModelFeatureResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelFeatureResponse setBody(UpdateModelFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelFeatureResponseBody getBody() {
        return this.body;
    }

}
