// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFeatureResponseBody body;

    public static UpdateFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFeatureResponse self = new UpdateFeatureResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFeatureResponse setBody(UpdateFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFeatureResponseBody getBody() {
        return this.body;
    }

}
