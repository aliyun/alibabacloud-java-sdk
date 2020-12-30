// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetBalanceBandwidthDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBalanceBandwidthDataResponseBody body;

    public static GetBalanceBandwidthDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBalanceBandwidthDataResponse self = new GetBalanceBandwidthDataResponse();
        return TeaModel.build(map, self);
    }

    public GetBalanceBandwidthDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBalanceBandwidthDataResponse setBody(GetBalanceBandwidthDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBalanceBandwidthDataResponseBody getBody() {
        return this.body;
    }

}
