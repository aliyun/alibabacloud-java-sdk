// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetBandwidthDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBandwidthDataResponseBody body;

    public static GetBandwidthDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBandwidthDataResponse self = new GetBandwidthDataResponse();
        return TeaModel.build(map, self);
    }

    public GetBandwidthDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBandwidthDataResponse setBody(GetBandwidthDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBandwidthDataResponseBody getBody() {
        return this.body;
    }

}
