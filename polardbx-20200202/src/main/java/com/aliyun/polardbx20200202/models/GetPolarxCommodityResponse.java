// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class GetPolarxCommodityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPolarxCommodityResponseBody body;

    public static GetPolarxCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolarxCommodityResponse self = new GetPolarxCommodityResponse();
        return TeaModel.build(map, self);
    }

    public GetPolarxCommodityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPolarxCommodityResponse setBody(GetPolarxCommodityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolarxCommodityResponseBody getBody() {
        return this.body;
    }

}
