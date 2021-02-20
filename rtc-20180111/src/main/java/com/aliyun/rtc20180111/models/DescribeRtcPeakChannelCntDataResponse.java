// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcPeakChannelCntDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DescribeRtcPeakChannelCntDataResponse setBody(DescribeRtcPeakChannelCntDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcPeakChannelCntDataResponseBody getBody() {
        return this.body;
    }

}
