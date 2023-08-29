// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetFeatureViewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFeatureViewResponseBody body;

    public static GetFeatureViewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureViewResponse self = new GetFeatureViewResponse();
        return TeaModel.build(map, self);
    }

    public GetFeatureViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFeatureViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFeatureViewResponse setBody(GetFeatureViewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFeatureViewResponseBody getBody() {
        return this.body;
    }

}
