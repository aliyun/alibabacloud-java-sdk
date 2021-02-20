// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcScaleDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcScaleDetailResponseBody body;

    public static DescribeRtcScaleDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcScaleDetailResponse self = new DescribeRtcScaleDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcScaleDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcScaleDetailResponse setBody(DescribeRtcScaleDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcScaleDetailResponseBody getBody() {
        return this.body;
    }

}
