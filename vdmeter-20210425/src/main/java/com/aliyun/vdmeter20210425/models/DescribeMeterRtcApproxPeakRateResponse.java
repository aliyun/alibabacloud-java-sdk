// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcApproxPeakRateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterRtcApproxPeakRateResponseBody body;

    public static DescribeMeterRtcApproxPeakRateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcApproxPeakRateResponse self = new DescribeMeterRtcApproxPeakRateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcApproxPeakRateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterRtcApproxPeakRateResponse setBody(DescribeMeterRtcApproxPeakRateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcApproxPeakRateResponseBody getBody() {
        return this.body;
    }

}
