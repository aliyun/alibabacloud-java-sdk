// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcPeakUserCntDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcPeakUserCntDataResponseBody body;

    public static DescribeRtcPeakUserCntDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcPeakUserCntDataResponse self = new DescribeRtcPeakUserCntDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcPeakUserCntDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcPeakUserCntDataResponse setBody(DescribeRtcPeakUserCntDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcPeakUserCntDataResponseBody getBody() {
        return this.body;
    }

}
