// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetFeatureDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFeatureDetailsResponseBody body;

    public static GetFeatureDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureDetailsResponse self = new GetFeatureDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetFeatureDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFeatureDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFeatureDetailsResponse setBody(GetFeatureDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFeatureDetailsResponseBody getBody() {
        return this.body;
    }

}
