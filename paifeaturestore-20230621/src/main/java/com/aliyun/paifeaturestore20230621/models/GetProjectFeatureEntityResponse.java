// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetProjectFeatureEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProjectFeatureEntityResponseBody body;

    public static GetProjectFeatureEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectFeatureEntityResponse self = new GetProjectFeatureEntityResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectFeatureEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectFeatureEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectFeatureEntityResponse setBody(GetProjectFeatureEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectFeatureEntityResponseBody getBody() {
        return this.body;
    }

}
