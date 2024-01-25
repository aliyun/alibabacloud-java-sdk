// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcPeakChannelCntDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMeterRtcPeakChannelCntDataResponseBody body;

    public static DescribeMeterRtcPeakChannelCntDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcPeakChannelCntDataResponse self = new DescribeMeterRtcPeakChannelCntDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcPeakChannelCntDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterRtcPeakChannelCntDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterRtcPeakChannelCntDataResponse setBody(DescribeMeterRtcPeakChannelCntDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcPeakChannelCntDataResponseBody getBody() {
        return this.body;
    }

}
