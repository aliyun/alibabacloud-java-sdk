// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcRtBandWidthUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterRtcRtBandWidthUsageResponseBody body;

    public static DescribeMeterRtcRtBandWidthUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcRtBandWidthUsageResponse self = new DescribeMeterRtcRtBandWidthUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcRtBandWidthUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterRtcRtBandWidthUsageResponse setBody(DescribeMeterRtcRtBandWidthUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcRtBandWidthUsageResponseBody getBody() {
        return this.body;
    }

}
