// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcApproxPeakRateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeMeterRtcApproxPeakRateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterRtcApproxPeakRateResponse setBody(DescribeMeterRtcApproxPeakRateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcApproxPeakRateResponseBody getBody() {
        return this.body;
    }

}
