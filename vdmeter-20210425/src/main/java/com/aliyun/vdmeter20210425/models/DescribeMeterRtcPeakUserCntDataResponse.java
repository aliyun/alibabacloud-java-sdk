// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcPeakUserCntDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMeterRtcPeakUserCntDataResponseBody body;

    public static DescribeMeterRtcPeakUserCntDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcPeakUserCntDataResponse self = new DescribeMeterRtcPeakUserCntDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcPeakUserCntDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterRtcPeakUserCntDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterRtcPeakUserCntDataResponse setBody(DescribeMeterRtcPeakUserCntDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcPeakUserCntDataResponseBody getBody() {
        return this.body;
    }

}
