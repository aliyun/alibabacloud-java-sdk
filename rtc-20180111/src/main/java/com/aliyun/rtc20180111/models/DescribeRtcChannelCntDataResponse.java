// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelCntDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcChannelCntDataResponseBody body;

    public static DescribeRtcChannelCntDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelCntDataResponse self = new DescribeRtcChannelCntDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelCntDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcChannelCntDataResponse setBody(DescribeRtcChannelCntDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcChannelCntDataResponseBody getBody() {
        return this.body;
    }

}
