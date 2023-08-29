// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetFeatureEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFeatureEntityResponseBody body;

    public static GetFeatureEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureEntityResponse self = new GetFeatureEntityResponse();
        return TeaModel.build(map, self);
    }

    public GetFeatureEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFeatureEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFeatureEntityResponse setBody(GetFeatureEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFeatureEntityResponseBody getBody() {
        return this.body;
    }

}
