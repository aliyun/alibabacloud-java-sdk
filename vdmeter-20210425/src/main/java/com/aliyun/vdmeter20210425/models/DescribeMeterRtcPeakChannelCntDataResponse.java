// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcPeakChannelCntDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeMeterRtcPeakChannelCntDataResponse setBody(DescribeMeterRtcPeakChannelCntDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcPeakChannelCntDataResponseBody getBody() {
        return this.body;
    }

}
