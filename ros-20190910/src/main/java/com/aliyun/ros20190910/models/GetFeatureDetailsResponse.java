// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetFeatureDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetFeatureDetailsResponse setBody(GetFeatureDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFeatureDetailsResponseBody getBody() {
        return this.body;
    }

}
