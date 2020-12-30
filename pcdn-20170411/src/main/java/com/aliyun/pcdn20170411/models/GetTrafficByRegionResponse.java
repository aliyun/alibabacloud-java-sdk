// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetTrafficByRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrafficByRegionResponseBody body;

    public static GetTrafficByRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficByRegionResponse self = new GetTrafficByRegionResponse();
        return TeaModel.build(map, self);
    }

    public GetTrafficByRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrafficByRegionResponse setBody(GetTrafficByRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrafficByRegionResponseBody getBody() {
        return this.body;
    }

}
