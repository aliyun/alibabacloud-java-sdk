// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class GetFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFeatureResponseBody body;

    public static GetFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureResponse self = new GetFeatureResponse();
        return TeaModel.build(map, self);
    }

    public GetFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFeatureResponse setBody(GetFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFeatureResponseBody getBody() {
        return this.body;
    }

}
