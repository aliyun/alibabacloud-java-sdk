// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcBandWidthUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterRtcBandWidthUsageResponseBody body;

    public static DescribeMeterRtcBandWidthUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcBandWidthUsageResponse self = new DescribeMeterRtcBandWidthUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcBandWidthUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterRtcBandWidthUsageResponse setBody(DescribeMeterRtcBandWidthUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcBandWidthUsageResponseBody getBody() {
        return this.body;
    }

}
