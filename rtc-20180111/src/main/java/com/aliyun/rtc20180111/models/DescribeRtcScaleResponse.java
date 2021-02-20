// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcScaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcScaleResponseBody body;

    public static DescribeRtcScaleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcScaleResponse self = new DescribeRtcScaleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcScaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcScaleResponse setBody(DescribeRtcScaleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcScaleResponseBody getBody() {
        return this.body;
    }

}
