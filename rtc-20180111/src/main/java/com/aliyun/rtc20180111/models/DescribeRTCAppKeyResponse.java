// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRTCAppKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRTCAppKeyResponseBody body;

    public static DescribeRTCAppKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRTCAppKeyResponse self = new DescribeRTCAppKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRTCAppKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRTCAppKeyResponse setBody(DescribeRTCAppKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRTCAppKeyResponseBody getBody() {
        return this.body;
    }

}
