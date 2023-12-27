// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcPeakChannelCntDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcPeakChannelCntDataResponseBody body;

    public static DescribeRtcPeakChannelCntDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcPeakChannelCntDataResponse self = new DescribeRtcPeakChannelCntDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcPeakChannelCntDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcPeakChannelCntDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRtcPeakChannelCntDataResponse setBody(DescribeRtcPeakChannelCntDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcPeakChannelCntDataResponseBody getBody() {
        return this.body;
    }

}
